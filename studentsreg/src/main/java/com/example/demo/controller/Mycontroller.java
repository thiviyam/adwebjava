package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.Studinfo;
import com.example.demo.models.Students;

@Controller
public class Mycontroller 
{
	@Autowired
	Studinfo dao;
	
	@RequestMapping("admission")
	@ResponseBody
    public String admi(Students std) 
    {
		if (dao.existsById(std.getRegno())) 
			return "<h1>register no already exist</h1>";
	
		dao.save(std);
		return "<h1>inserted</h1>";		
	}
	
	
	@RequestMapping("/updating")
	@ResponseBody
	public String updatestd(Students std)
	{
		if(!dao.existsById(std.getRegno()))
			return "<h1> No such regno exist </h1>";
		
		dao.save(std);
		return "<h1> Updated </h1>";
	}
	
	
	@RequestMapping("/deleting")
	@ResponseBody
	public String deletestud(int regno) 
	{
		if(!dao.existsById(regno))
			return "<h1> Reg no does not exist to delete </h1>";
		dao.deleteById(regno);
		return "<h1> deleted </h1>";
	}
	
	
	@RequestMapping("/veiwing")
	@ResponseBody
	public String viewed() 
	{
		return dao.findAll().toString();
	}
}

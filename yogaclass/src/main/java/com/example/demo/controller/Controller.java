package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Yogadata;
import com.example.demo.model.Customdetails;

@RestController
@RequestMapping("yoga")
public class Controller 
{
    @Autowired
	Yogadata dao;
	
	@GetMapping("onsubmit")
	@ResponseBody
	public String savecustom(Customdetails c)
	{
		dao.save(c);
		return "submitted";
	}
	
	@PutMapping("update")
	public void updatecustom(Customdetails c)
	{
		dao.save(c);
	}
	
	@DeleteMapping("delete")
	public void deletecustom(int customerId)
	{
		dao.deleteById(customerId);
	}
	
	@GetMapping("display")
	public Optional<Customdetails> displaycustom(int customerId)
	{
		return dao.findById(customerId);
	}
	
	@GetMapping("displayall")
	public List<Customdetails> displayAllcustom()
	{
		return dao.findAll();
	}
	
}

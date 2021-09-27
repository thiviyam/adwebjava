package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Divers;

@Controller
public class Mycontroller 
{
	
	@RequestMapping("/registration")
	public ModelAndView register(Divers d)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",d.getName());
		mv.setViewName("thankyou.jsp");
		return mv;
		
	}
	
	@RequestMapping("/hello")
	private String pub() 
	{
          return "thankyou.jsp";		
	}

}

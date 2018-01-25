package com.grocery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class IndexController {

	@RequestMapping(value="/")
	public String indexPage()
	{
		return "index";
	}
	
/*	@RequestMapping(value="/newUser", method=RequestMethod.GET)
	public ModelAndView newUser(ModelAndView model)
	{
		User user=new User();
		model.addObject("user",user);
		model.setViewName("UserRegistration");
		return model;
	}*/
	
}

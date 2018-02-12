package com.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.grocery.Dao.UserDao;
import com.grocery.DaoImpl.UserDaoImpl;
import com.grocery.Model.User;






@Controller
public class IndexController {

	@Autowired	
	UserDaoImpl userDaoImpl;
	
	
	
	
	@RequestMapping("/")
	public String indexPage()
	{
		return "index";
	}
	
	
	@RequestMapping(value="/saveUser",method=RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("user")User user)
	{
		ModelAndView mv=new ModelAndView();
		
		user.setRole("ROLE_USER");
		userDaoImpl.insertUser(user);
		mv.setViewName("index");
		return mv;
	}
	
	
	
	
	
}

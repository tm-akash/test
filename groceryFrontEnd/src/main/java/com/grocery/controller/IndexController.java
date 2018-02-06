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
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String indexPage()
	{
		return "index";
	}
	
	@RequestMapping(value="/newUser", method=RequestMethod.POST)
	public ModelAndView newUser(@ModelAttribute User user)
	{
			
		System.out.println("The new user name entered is: "+user.getName());
		userDaoImpl.insertUser(user);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public ModelAndView view()
	{
		return new ModelAndView("index");
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

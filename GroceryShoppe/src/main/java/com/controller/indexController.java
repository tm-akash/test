package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DaoImpl.UserDaoImpl;
import com.Model.User;

@Controller
public class indexController
{
    

	
	@Autowired
	UserDaoImpl userDaoImpl;
	
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	

@RequestMapping(value="/register", method = RequestMethod.GET)
public ModelAndView showRegister()
{
	ModelAndView mav = new ModelAndView();
	// This class can map the view with it's corresponding Model class
	//Thus we use the object of this class to take reference of model class
	// and name of view
	mav.addObject("user", new User());// class
	mav.setViewName("register");// jsp
	return mav;
	
}



@RequestMapping(value="/saveregister", method = RequestMethod.POST)
public ModelAndView saveRegister(@Valid @ModelAttribute("user") User user, BindingResult result)
{
	ModelAndView mav= new ModelAndView();
	if(result.hasErrors())
	{
		mav.setViewName("register");
		return mav;
		
	}
	else
	{
		user.setRole("ROLE_USER");// user and admin
		userDaoImpl.insertUser(user);
		mav.setViewName("index");
		return mav;
	}
	
}
}

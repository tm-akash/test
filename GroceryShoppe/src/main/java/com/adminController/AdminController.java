package com.adminController;

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

import com.Dao.UserDao;
import com.DaoImpl.UserDaoImpl;
import com.Model.User;

@Controller
public class AdminController {
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping(value="/admin")
	public ModelAndView admin()
	{
			
		System.out.println("Inside admin controller");
	//	userDao.insertUser(user);
		return new ModelAndView("adminAdd");
	}
	
	

}

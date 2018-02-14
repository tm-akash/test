package com.GroceryBack.Test;


import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.UserDao;
import com.DaoImpl.UserDaoImpl;
import com.Model.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;
	private static UserDao userDao;
	private static UserDaoImpl userDaoImpl;
	private User user;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		userDao = (UserDao) context.getBean("userDao");
		
	}
	
	
	@Test
	public void testAddUser()
	{
		user = new User();
		user.setName("Akash");
		user.setPassword("password");
		user.setRole("ADMIN");
		assertEquals("Successfully added user",true,userDao.insertUser(user));
		//assertEquals("done!!",userDao.insertUser(user));
	}
	
	
	
	
}
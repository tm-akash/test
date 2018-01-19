package com.grocery.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import com.grocery.Dao.UserDao;
import com.grocery.Model.User;

public class UserDaoImpl implements UserDao
{
	@Override
	public void show()
	{
		List<User> user1= new ArrayList<User>();
		User u1=new User("ak","sd","df","fg");
		user1.add(u1);
		
		// User p=new User();
		for(User p:user1)
		{
			System.out.println(p.getName());
		}
		
	}
	
	
}

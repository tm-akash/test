package com.grocery.calling;

import org.springframework.beans.factory.annotation.Autowired;

import com.grocery.Dao.UserDao;
import com.grocery.DaoImpl.UserDaoImpl;

public class InvokeMethod {
	
	
	public static void main(String args[])
	{
	 
	  UserDaoImpl userDaoImpl = new UserDaoImpl();
	  
	 userDaoImpl.show();
	 
	}

}

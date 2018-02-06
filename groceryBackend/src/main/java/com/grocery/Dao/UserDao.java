package com.grocery.Dao;

import org.springframework.stereotype.Component;

import com.grocery.DaoImpl.*;
import com.grocery.Model.User;



public interface UserDao {

    
	void insertUser(User user);	
}

package com.Dao;

import org.springframework.stereotype.Component;

import com.DaoImpl.*;
import com.Model.User;



public interface UserDao {

    
	void insertUser(User user);	
}

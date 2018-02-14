package com.DaoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Dao.CategoryDao;

@Repository("CategoryDaoImpl")
public class CategoryDaoImpl implements CategoryDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	 @Autowired
	    public CategoryDaoImpl(SessionFactory sessionFactory)
	    {
	    	super();
	    	this.sessionFactory= sessionFactory;
	    }

}

package com.DaoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Dao.CategoryDao;
import com.Model.Category;

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

	 @Transactional
		public void insertCategory(Category category)
		{
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(category);
			session.getTransaction().commit();
		}
	 
	 public List<Category> retrieveCat()
	 {
		 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		 List<Category> li = session.createQuery("from Category").list();
		 session.getTransaction().commit();
		 return li;
	 }
}

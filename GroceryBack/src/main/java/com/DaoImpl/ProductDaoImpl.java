package com.DaoImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Dao.ProductDao;
import com.Model.Product;
import com.Model.Supplier;

@Repository("ProductDaoImpl")
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	 @Autowired
	    public ProductDaoImpl(SessionFactory sessionFactory)
	    {
	    	super();
	    	this.sessionFactory= sessionFactory;
	    }
	 
	 @Transactional
		public void insertProduct(Product product)
		{
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(product);
			session.getTransaction().commit();
		}

}

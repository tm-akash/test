package com.DaoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Dao.SupplierDao;
import com.Model.Category;
import com.Model.Supplier;

@Repository("SupplierDaoImpl")
public class SupplierDaoImpl implements SupplierDao {

	@Autowired
	SessionFactory sessionFactory;
	
	 @Autowired
	    public SupplierDaoImpl(SessionFactory sessionFactory)
	    {
	    	super();
	    	this.sessionFactory= sessionFactory;
	    }
	 
	 
	 @Transactional
		public void insertSupplier(Supplier supplier)
		{
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(supplier);
			session.getTransaction().commit();
		}
	 
	 public List<Supplier> retrieveSup()
	 {
		 Session session = sessionFactory.openSession();
		 session.beginTransaction();
		 List<Supplier> li = session.createQuery("from Supplier").list();
		 session.getTransaction().commit();
		 return li;
	 }
	
	
}

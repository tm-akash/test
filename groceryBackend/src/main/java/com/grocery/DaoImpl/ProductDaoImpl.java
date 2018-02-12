package com.grocery.DaoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.grocery.Dao.CategoryDao;
import com.grocery.Model.Category;
import com.grocery.Model.Product;
import com.grocery.Model.Supplier;

@Repository
@Service
public class ProductDaoImpl {

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	public ProductDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void insertProduct(Product product)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(product);
		session.getTransaction().commit();
	}
	
	public List<Product> retrieveAllProd()
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<Product> li= session.createQuery("from Product").list();
		session.getTransaction().commit();
		return li;
		
	}
	
	
	public Product findById(int pid)
	{
		Session session = sessionFactory.openSession();
		Product p=null;
		try
		{
			
			session.beginTransaction();
	//incomplete		p= session.get
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return p;
	}
	
	
	public List<Product> getProductByCid(int cid)
	{
		Session session = sessionFactory.openSession();
		List<Product> li= null;
		session.beginTransaction();
		
		li= session.createQuery("from product where cid="+cid).list();
		session.getTransaction().commit();
		return li;
	}
	
	
	public void deleteProd(int pid)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Product p = (Product)session.get(Product.class,pid);
		session.delete(p);
		session.getTransaction().commit();
	}
	
	public void updateProd(Product p)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();		
		session.update(p);
		session.getTransaction().commit();
	}
	
}

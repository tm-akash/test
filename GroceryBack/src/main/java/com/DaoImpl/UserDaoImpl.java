package com.DaoImpl;



import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Dao.UserDao;

import com.Model.User;

@Repository("UserDaoImpl")
/*@Service*/
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	 @Autowired
	    public UserDaoImpl(SessionFactory sessionFactory)
	    {
	    	super();
	    	this.sessionFactory= sessionFactory;
	    }
		
	
	@Transactional
	public boolean insertUser(User user)
	{
		try{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(user);
		session.getTransaction().commit();
		return true;
		//sessionFactory.getCurrentSession().save(user);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		
		
	}
	
	
}

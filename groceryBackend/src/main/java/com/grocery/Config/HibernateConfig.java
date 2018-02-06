package com.grocery.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.grocery.Dao.UserDao;
import com.grocery.DaoImpl.CategoryDaoImpl;
import com.grocery.DaoImpl.SupplierDaoImpl;
import com.grocery.DaoImpl.UserDaoImpl;
import com.grocery.Model.*;


@Configuration
@ComponentScan("com.*")
@EnableWebMvc
@EnableTransactionManagement
public class HibernateConfig {
	@Autowired
	@Bean(name="dataSource")
	public DataSource getH2Data()
	{
		System.out.println("Hibernate init");
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		System.out.println("H2 Connected");
		return dataSource;
	}
	
	private Properties getHiberProp()
	{
		Properties p=new Properties();
		p.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		p.put("hibernate.hbm2ddl.auto","update");
		p.put("hibernate.show_sql","true");
		System.out.println("Data Table Created in H2");
		return p;
	}
	
	@SuppressWarnings("deprecation")
	@Autowired
	@Bean(name="sessionFactory")
		public SessionFactory getSessionFac(DataSource dataSource)
	{
		LocalSessionFactoryBuilder sb=new LocalSessionFactoryBuilder(dataSource);
		sb.addProperties(getHiberProp());
		sb.addAnnotatedClass(User.class);
		
		return sb.buildSessionFactory();
	}
	
	@Autowired
	@Bean(name="supplierDaoImpl")
	public SupplierDaoImpl getSuppData(SessionFactory sf)
	{
		return new SupplierDaoImpl(sf);
	}
	
	
	
	@Autowired
	@Bean(name="categoryDaoImpl")
	public CategoryDaoImpl getCategoryData(SessionFactory sf)
	{
		return new CategoryDaoImpl(sf);
	}
	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTrans(SessionFactory sf)
	{
		
		HibernateTransactionManager tm=new HibernateTransactionManager(sf);
		return tm;
	}
	
	@Autowired
	@Bean(name = "userDaoImpl")
	public UserDao getUserData(SessionFactory sf) {
	    return new UserDaoImpl(sf);
	}
	
	
}


/*@Configuration
@ComponentScan("com.*")
@EnableTransactionManagement

public class HibernateConfig 
{
	@Bean(name="dataSource")
	  public DataSource getH2DataSource()
	  {
         System.out.println("----Data Source Creation-----");
		   DriverManagerDataSource dataSource = new DriverManagerDataSource();
		   dataSource.setDriverClassName("org.h2.Driver");
		   dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		   dataSource.setUsername("sa");
		   dataSource.setPassword("");
		   System.out.println("----Data Source Creation-----");
		   return dataSource;
	  }
	   @Autowired
	   @Bean(name="sessionFactory")
	   public SessionFactory getSessionFactory(DataSource dataSource)
	   {
         System.out.println("------Hibernate properties creation------");
		   Properties properties=new Properties();
		   properties.setProperty("hibernate.hbm2ddl.auto", "update");
		   properties.put("hibernate.show_sql", "true");
		   properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		   System.out.println("------Hibernate properties created------");
		   
		   System.out.println("------LacalSessionFactoryBuider object creation------");
		   LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(getH2DataSource());
		   sessionBuilder.addProperties(properties);
		   System.out.println("------Factory Builder object created------");
		   sessionBuilder.addAnnotatedClass(User.class);
		   sessionBuilder.addAnnotatedClass(Supplier.class);
		   sessionBuilder.addAnnotatedClass(Product.class);
		   sessionBuilder.addAnnotatedClass(UserDetail.class);
		   sessionBuilder.addAnnotatedClass(Cart.class);
		   sessionBuilder.addAnnotatedClass(CartItem.class);
		   sessionBuilder.addAnnotatedClass(UserOrder.class);
		  // sessionBuilder.addAnnotatedClass(Cart.class);
		   System.out.println("------Session Factory  object creation------");
		   SessionFactory sessionFactory=sessionBuilder.buildSessionFactory();
		   System.out.println("------Session factory object created------");
		   return sessionFactory;
		   //return sessionBuilder.buildSessionFactory();
	   }
	   
	   
     @Autowired
	   @Bean(name="transactionManager")
	   public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	   {

		   HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
				   return transactionManager;
	   }
     
    
	   @Autowired
	   @Bean(name="categoryDAO")
	   public CategoryDAO getCategoryDAO(SessionFactory sessionFactory)
	   {
		   System.out.println("-- Category DAO Object Creation--");
		   return new CategoryDAO(sessionFactory);
	   }
	   
	  @Autowired
	   @Bean(name="supplierDAO")
	   public SupplierDAO getSupplierDAO(SessionFactory sessionFactory)
	   {
        System.out.println("-----Supplier DAO object Creation------");
        return new SupplierDAO(sessionFactory);
		   
	   }
	   @Autowired
	   @Bean(name="productDAO")
	   public ProductDAO getProductDAO(SessionFactory sessionFactory)
	   {
        System.out.println("-----Product DAO object Creation------");
        return new ProductDAO(sessionFactory);
		   
	   }
	  
	   @Autowired
	   @Bean(name="userdetailDAO")
	   public UserDetailDAO getUserDetailDAO(SessionFactory sessionFactory)
	   {
        System.out.println("-----User DAO object Creation------");
        return new UserDetailDAO(sessionFactory);
		   
	   }
	   @Autowired
	   @Bean(name="cartDAO")
	   public CartDAO getCartDAO(SessionFactory sessionFactory)
	   {
        System.out.println("-----Cart DAO object Creation------");
		return new CartDAO(sessionFactory);
       
	   }	
	   @Autowired
	   @Bean(name="cartItemDAO")
	   public CartItemDAO getCartItemDAO(SessionFactory sessionFactory)
	   {
        System.out.println("-----CartItem DAO object Creation------");
		return new CartItemDAO(sessionFactory);
	   }
	   
	   @Autowired
	   @Bean(name="userOrderDAO")
	   public UserOrderDAO getUserOrderDAO(SessionFactory sessionFactory)
	   {
        System.out.println("-----UserOrder DAO object Creation------");
		return new UserOrderDAO(sessionFactory);
	   }
}*/
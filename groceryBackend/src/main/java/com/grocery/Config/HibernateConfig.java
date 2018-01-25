package com.grocery.Config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.grocery.Model.*;


@Component
@ComponentScan("com")
@EnableTransactionManagement
public class HibernateConfig {
	@Autowired
	@Bean(name="DataSource")
	public DataSource getH2Data()
	{
		System.out.println("Hibernate init");
		DriverManagerDataSource dsource= new DriverManagerDataSource();
		dsource.setDriverClassName("org.h2.Driver");
		dsource.setUrl("jdbc:h2:tcp://localhost/~/test");
		dsource.setUsername("sa");
		dsource.setPassword("");
		System.out.println("H2 Connected");
		return dsource;
	}
	
	private Properties getHiberProp()
	{
		Properties p=new Properties();
		p.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
	  //p.put("hibernate.hbm2ddl.auto","update");
		p.put("hibernate.show_sql","true");
		System.out.println("Data Table Created in H2");
		return p;
	}
	
	@SuppressWarnings("deprecation")
	@Autowired
	@Bean(name="SessionFactory")
		public SessionFactory getSessionFac(DataSource datasource)
	{
		LocalSessionFactoryBuilder sb=new LocalSessionFactoryBuilder(datasource);
		sb.addProperties(getHiberProp());
		sb.addAnnotatedClass(User.class);
		
		return sb.buildSessionFactory();
	}
	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTrans(SessionFactory sf)
	{
		
		HibernateTransactionManager tm=new HibernateTransactionManager(sf);
		return tm;
	}
	
	
}

package com.org.hibernateproject.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	
        System.out.println( "Hello World!" );
       
        
       Configuration cfg= new  Configuration();
        
        cfg.configure("hibernate.cfg.xml");  // hibernate.cfg.xml is name of hibernate xml file 
        
        SessionFactory factory = cfg.buildSessionFactory();  // session factory isan interface used in hibernate framework
          
		/*
		 * SessionFactory factory=new Configuration().configure().buildSessionFactory(); we can write like this also in place of above three lines
		 */        
        
        System.out.println(factory.isClosed()); // to check factory is closed or not 
        
        Student s1= new Student();
        
        s1.setId(8);
        s1.setName("vishal");
        s1.setCity("pune");
        
        System.out.println(s1);
        
        
        Session session= factory.openSession();  // it will open a session   //session=> The main runtime interface between a Java application and Hibernate
        
        session.beginTransaction();
        session.save(s1);   // save method will fire insert query
        
        session.getTransaction().commit();
        
        System.out.println("done");
        
        session.close();
        
        
        
        
        
    }
}

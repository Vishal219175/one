package com.org.savingimageintodatabase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Savingimage_main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 Configuration cfg= new  Configuration();
	        
	     cfg.configure("hibernate.cfg.xml");  // hibernate.cfg.xml is name of hibernate xml file 
	        
	      SessionFactory factory = cfg.buildSessionFactory();  // session factory isan interface used in hibernate framework

	      /*
			 * SessionFactory factory=new Configuration().configure().buildSessionFactory(); we can write like this also in place of above three lines
		  */        

		Address ad= new Address();
		ad.setStreet("Street1");
		ad.setCity("Mumbai1");
		ad.setOPen(true);
		Date d1=new Date();
		ad.setAddDate(d1);  
		
	//	ad.setAddDate(new Date());  we can do this also in place of above two lines  we have done here new date as adddate datatype is date as we have to create its object here only
		
		ad.setX(34.6);
		
	      
		//Reading Image
        FileInputStream fin= new FileInputStream("src/main/java/steven.jpg");  
        byte[] data= new byte[fin.available()];
        fin.read(data);

	     ad.setImage(data); 
	      
	      
	     Session session = factory.openSession();  //session=>The main runtime interface between a Java application and Hibernate
	       session.beginTransaction();
	                         
	       session.save(ad);                   //saving object of address class
	       session.getTransaction().commit();

	     
	     System.out.println("done");	     
	     
	     session.close();
	     
	     
	     
	     
	     
	}

}

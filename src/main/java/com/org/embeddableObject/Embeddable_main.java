package com.org.embeddableObject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embeddable_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		 
		  
		
		 Student2 s2 = new Student2();  
		 s2.setId(7);
		 s2.setName("cristiano");
		 s2.setCity("Portugal");

	 
		 Certificate c1= new Certificate();
		 c1.setCourse("Java Full Stack Devolopment");
		 c1.setDuration("6 months");

		 s2.setCerti(c1);   // this this is for first row

		 
		 Student2 s3 = new Student2();  
		 s3.setId(9);
		 s3.setName("messi");
		 s3.setCity("Argentina");
		 
		 	 		 
		  Certificate c2= new Certificate();
		  c2.setCourse("Python Full Stack Devolopment");
		  c2.setDuration("4 months");
		 
		  s3.setCerti(c2);  // this this is for second row
		 
		  
		  Student2 s4 = new Student2();  
			 s4.setId(11);
			 s4.setName("sachin");
			 s4.setCity("mumbai");

		 
			 Certificate c3= new Certificate();
			 c3.setCourse("UI/UX Full Stack Devolopment");
			 c3.setDuration("8 months");

			 s4.setCerti(c3);   // this this is for first row

		 
		  
		  Session session= factory.openSession();   // session is opened here 
		  
		  Transaction tx=session.beginTransaction(); 
			 
			 //saving objects into db
			 session.save(s2);
			 session.save(s3);
			 session.save(s4);
			 
			 
			 tx.commit();
			 
			 
			 
			 session.close();  // session is closed here
			 
			 
			 factory.close();   // factory is closed here

		
		
	}

}

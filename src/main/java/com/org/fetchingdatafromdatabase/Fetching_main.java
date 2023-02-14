package com.org.fetchingdatafromdatabase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetching_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		 
		 Session session=factory.openSession();

		    //both methods get(),load() are used to fetch record from the database
		 
			/* Student1 s= session.get(Student1.class, 1); */  // here get method is used and we can use load also in place of this but tere is an difference 
		                                                       
		       Student1 s= session.load(Student1.class, 1);   
		
		       System.out.println(s);
		
	
		
		
		      session.close();
		
		
		
	}

}

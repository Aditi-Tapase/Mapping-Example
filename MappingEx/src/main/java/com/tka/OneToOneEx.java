package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneEx {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Mobile.class);
		cfg.addAnnotatedClass(MobileDetails.class);
		SessionFactory factory= cfg.buildSessionFactory();
		
		// session==connection
		Session session= factory.openSession();
		
		//insertion
//		MobileDetails details=new MobileDetails(16, 64);
//		Mobile mobile=new Mobile("Motorola", 15000, details);
//		session.save(mobile);
//		session.beginTransaction().commit();
//		System.out.println("Data Inserted");
		
		// delete
//		Mobile mobile= new Mobile(3);
//		session.delete(mobile);
//		session.beginTransaction().commit();
//		System.out.println("data deleted");
	}

}

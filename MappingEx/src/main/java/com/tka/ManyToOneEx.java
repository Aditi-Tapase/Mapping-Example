package com.tka;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToOneEx {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Classroom.class);
		cfg.addAnnotatedClass(Student.class);
		SessionFactory factory= cfg.buildSessionFactory();
		
		// session==connection
		Session session= factory.openSession();
		
		// Create Classroom
				Classroom cls = new Classroom();
				cls.setClsid(1);
				cls.setClsname("Java");

				// Create Students
				Student s1 = new Student("Aditi", cls);
				Student s2 = new Student("Ravi", cls);
				Student s3 = new Student("Meera", cls);

				// Save data
				session.save(cls); 
				session.save(s1);
				session.save(s2);
				session.save(s3);

				session.beginTransaction();
				// cascade saves students
				session.getTransaction().commit();

				System.out.println("Inserted successfully.");
				session.close();
				factory.close();

} }

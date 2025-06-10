package com.tka;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyEx {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Product.class);
		cfg.addAnnotatedClass(ShopLocation.class);
		SessionFactory factory= cfg.buildSessionFactory();
		
		// session==connection
		Session session= factory.openSession();

		List<Product> products =new ArrayList<>();
		Product s1=new Product("phone");
		Product s2=new Product("Mask");
		products.add(new Product("Charger"));
		products.add(s1);;
		products.add(s2);
		ShopLocation pro=new ShopLocation("Delhi", products);
		session.save(pro);
		session.beginTransaction().commit();
		System.out.println("data inserted");
} }

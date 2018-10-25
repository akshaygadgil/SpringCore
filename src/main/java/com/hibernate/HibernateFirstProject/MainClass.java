package com.hibernate.HibernateFirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tx = s.beginTransaction();
		Employee e = new Employee(1, "aki", "gadgil");
		s.save(e);
		tx.commit();
		s.close();
		sf.close();
		System.out.println("Success...");
		
		

	}

}

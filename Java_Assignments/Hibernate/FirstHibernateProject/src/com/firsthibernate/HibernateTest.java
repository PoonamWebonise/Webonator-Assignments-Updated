package com.firsthibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserId(4);
		user.setName("fourthuser");
		user.setUserId(5);
		user.setName("fifthuser");
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}
}

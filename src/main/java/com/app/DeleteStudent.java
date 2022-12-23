package com.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.ClassStudent;

public class DeleteStudent {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		ClassStudent student = session.get(ClassStudent.class, 4);

		session.delete(student);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}

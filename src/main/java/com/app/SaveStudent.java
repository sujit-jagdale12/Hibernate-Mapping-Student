package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.ClassStudent;

public class SaveStudent {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		ClassStudent student = new ClassStudent();
		student.setFirstName("Sagar");
		student.setLastName("Akuch");
		student.setEmail("sagarakuch123@gmail.com");
		student.setAge(23);

		session.save(student);

		session.close();
		factory.close();
	}

}

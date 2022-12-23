package com.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.ClassStudent;

public class GetAllStudent {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		List<ClassStudent> list = session.createQuery("from ClassStudent").list();
		
		for (ClassStudent student : list) {
			System.out.println(student.getId());
			System.out.println(student.getFirstName());
			System.out.println(student.getLastName());
			System.out.println(student.getEmail());
			System.out.println(student.getAge());
			System.out.println("====================");
		}

		session.close();
		factory.close();

	}

}

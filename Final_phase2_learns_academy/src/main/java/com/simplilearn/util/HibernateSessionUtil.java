package com.simplilearn.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.simplilearn.model.ClassRoom;
import com.simplilearn.model.Learner_Subject;


public class HibernateSessionUtil {
	
	private static SessionFactory factory;
	
	public static SessionFactory buildSessionFactory() {
		factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(ClassRoom.class)
				.addAnnotatedClass(Learner_Subject.class)
				.buildSessionFactory();
		return factory;
	}

}

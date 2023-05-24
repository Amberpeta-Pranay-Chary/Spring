package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateCoursesDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// Get the Instructors from the db
			int id = 1;
			session.beginTransaction();
			Instructor tempInstructor = session.get(Instructor.class, 1);
			Course tempCourse1 = new Course("JDBLL");
			Course tempCourse2 = new Course("FUllL-Stack");

			
		    tempInstructor.add(tempCourse1); tempInstructor.add(tempCourse2);
			 
			session.save(tempCourse1);
			session.save(tempCourse2);
			session.getTransaction().commit();

		} finally {
			session.close();
			factory.close();
		}
	}

}

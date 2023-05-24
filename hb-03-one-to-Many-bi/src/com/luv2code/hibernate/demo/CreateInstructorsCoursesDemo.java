package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateInstructorsCoursesDemo {

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
			
			
			List<Course> Courses=tempInstructor.getCourses();
			for(Course x : Courses)
			{
				System.out.println(x);
			}
			session.getTransaction().commit();

		} finally {
			session.close();
			factory.close();
		}
	}

}

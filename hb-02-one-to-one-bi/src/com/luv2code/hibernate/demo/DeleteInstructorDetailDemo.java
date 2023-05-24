package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class DeleteInstructorDetailDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			session.beginTransaction();
			int id=2;
			
			InstructorDetail tempDetail=session.get(InstructorDetail.class,id);
			
			System.out.println("Instructor Detail Object : "+tempDetail);
			tempDetail.setInstructor(null);
			//Deleting this Instructor Detial should also delete the Corresponding Instructor
			session.delete(tempDetail);
			
			// start a transaction
		
		
			// commit transaction
			session.getTransaction().commit();
			/*
			 * } catch(Exception e) {
			 * System.out.println("Hey that Id is not present buddy"); }
			 */
			
			System.out.println("Done!");
		}
		finally {
			session.close();
			factory.close();
		}
	}

}






package com.luv2code.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import comn.luv2code.hibernate.demp.entity.Student;

public class UpdateStudentDemo {
	
	public static void main(String ar[]) throws Exception
	{
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		try {
			//Created student Objects
			session.beginTransaction();
			//Retrieving the Student Object with first name pranay
			/*
			 * Student theStudent=(Student)session.
			 * createQuery("from Student s where s.firstName='PPranay' ").getSingleResult();
			 * theStudent.setFirstName("Pranay");
			 */
			
			session.createQuery("Update Student s set s.email='pranaychary156@gmail.com' where s.firstName='Pranay' ").executeUpdate();
			/*
			 * if(theStudent!=null) System.out.println(theStudent);
			 * session.save(theStudent);
			 */
			session.getTransaction().commit();
			System.out.println("done");
			
			
			
			
		}
		finally {
			factory.close();
		}
		
	}

}

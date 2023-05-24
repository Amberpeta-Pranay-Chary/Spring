package com.luv2code.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import comn.luv2code.hibernate.demp.entity.Student;

public class DeleteStudentDemo {
	
	public static void main(String ar[]) throws Exception
	{
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		try {
			//Create 3 student Objects
			session.beginTransaction();
			/*
			 * Student theStudent=session.get(Student.class,13); session.delete(theStudent);
			 */
			
			session.createQuery("delete from Student where id>7").executeUpdate();
			
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally {
			factory.close();
		}
		
	}

}

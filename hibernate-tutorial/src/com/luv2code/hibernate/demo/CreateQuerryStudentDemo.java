package com.luv2code.hibernate.demo;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import comn.luv2code.hibernate.demp.entity.Student;

public class CreateQuerryStudentDemo {
	
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
			List<Student> student=session.createQuery("from Student s where s.email like '%@gmail.com' ").getResultList();
			for(Student x:student)
			{
				System.out.println(x);
			}
		//System.out.println();
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally {
			factory.close();
		}
		
	}

}

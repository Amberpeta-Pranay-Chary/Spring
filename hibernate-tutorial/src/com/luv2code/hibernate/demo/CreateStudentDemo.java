package com.luv2code.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import comn.luv2code.hibernate.demp.entity.Student;

public class CreateStudentDemo {
	
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
			Student student=new Student("Rahul","Reddy","Reddy@gmail.com");
			session.save(student);
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally {
			factory.close();
		}
		
	}

}

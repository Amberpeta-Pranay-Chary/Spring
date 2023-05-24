package com.luv2code.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import comn.luv2code.hibernate.demp.entity.Student;

public class ReadStudentDemo {
	
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
			Student student=new Student("Ramesh","Poola","RameshPoola@gmail.com");
			session.save(student);
			
			session.getTransaction().commit();
			System.out.println("done");
			
			//Retrieving the Object
			Session newSession=factory.getCurrentSession();
			newSession.beginTransaction();
			Student StudentObject=newSession.get(Student.class,student.getId());
			System.out.println(StudentObject);
			newSession.getTransaction().commit();
			
			
		}
		finally {
			factory.close();
		}
		
	}

}

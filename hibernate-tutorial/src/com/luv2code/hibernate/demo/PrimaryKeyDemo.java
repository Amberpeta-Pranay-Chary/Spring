package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comn.luv2code.hibernate.demp.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		try {
			//Create 3 student Objects
			Student student=new Student("Prudvi","Dasari","Prudvi@gmail.com");
			Student student2=new Student("Chandanaa","Rajesh","ChandanaaRajesh@gmail.com");
			Student student3 =new Student("Shashivardhan","Reddy","Shahsi@gmail.com");
			session.beginTransaction();
			session.save(student);
			session.save(student2);
			session.save(student3);
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally {
			factory.close();
		}
		
	}

}

package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Read the XML Configuaration File.
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from the container
		//Coach theCoach=context.getBean("theSillyCoach",Coach.class);
//		Coach theCoach=context.getBean("swimCoach",Coach.class);
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
		//Calling the Method
		System.out.println("His Name : "+theCoach);
		System.out.println("His Aim : "+theCoach.getAim());
		System.out.println(theCoach.getDailyFortune());
		
		//Closing the context
		context.close();
	}

}

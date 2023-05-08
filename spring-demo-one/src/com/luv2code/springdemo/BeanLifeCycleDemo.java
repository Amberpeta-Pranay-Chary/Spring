package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {
	
	public static void main(String ar[]) {
	//Load the Spring Config File
	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("BeanLifeCycleScope-applicationContext3.xml");
	
	//retrive bean from the Container
	Coach theCoach=context.getBean("myCoach",Coach.class);
	
	//Call methods on Bean
	System.out.println(theCoach.getDailyFortune());
	//Close the Context
	context.close();
	
	}
}

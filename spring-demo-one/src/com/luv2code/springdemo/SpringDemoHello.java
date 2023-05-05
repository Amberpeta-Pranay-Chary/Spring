package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoHello {
	
	public static void main(String ar[]) {
	//Load the Spring Config File
	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//retrive bean from the Container
	Coach theCoach=context.getBean("myCoach",Coach.class);
	
	//Call methods on Bean
	System.out.println(theCoach.getDailyWorkOut());
	
	//Close the Context
	context.close();
	
	}
}

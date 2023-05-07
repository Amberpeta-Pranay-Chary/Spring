package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDependencyInjection {
	public static void main(String ar[]) {
		//Load the Spring Config File
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from the Container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		//Call methods on Bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.teamName));
		
		//Close the Context
		context.close();
		
		}
}

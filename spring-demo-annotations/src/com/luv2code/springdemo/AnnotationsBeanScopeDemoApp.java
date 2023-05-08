package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemoApp {
	
	public static void main(String arg[]) {
	
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Coach theCoach=context.getBean("tennisCoach",Coach.class);
	Coach theCoach2=context.getBean("tennisCoach",Coach.class);
	
	System.out.println("TheCoach "+theCoach+" theCoach2 "+theCoach2+" "+(theCoach==theCoach2));
	}
}

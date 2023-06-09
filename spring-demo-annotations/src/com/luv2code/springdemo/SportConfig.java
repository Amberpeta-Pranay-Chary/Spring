package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sports.properties")
public class SportConfig {
	
	@Bean
	public FortuneService sadFortuneService()
	{
		return new sadFortuneService();
	}
	
	@Bean
	public Coach swimCoach(FortuneService fortuneService)
	{
		SwimCoach theCoach=new SwimCoach(sadFortuneService());
		return theCoach;
	}

}

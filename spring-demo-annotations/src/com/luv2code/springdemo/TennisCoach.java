package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	TennisCoach()
	{
		System.out.println("Tennis Constructor");
	}
	//Setting Settor Method
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */



	/*
	 * @Autowired TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService=fortuneService; }
	 */
	//Adding init Method
	@PostConstruct
	public void doMyStartUpStuff()
	{
		System.out.println("Inside the Init method");
	}
	@PreDestroy
	public void doMyCleanUpStuff()
	{
		System.out.println("Inside Destroy Method");
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Tennis Coach Work out";
	}
	
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

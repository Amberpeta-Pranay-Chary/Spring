package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	String name;
	@Value ("${foo.aim}")
	String aim;
	
	SwimCoach(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim WorkOut";
	}

	public String getName() {
		return name;
	}
	
	public String getAim() {
		return aim;
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

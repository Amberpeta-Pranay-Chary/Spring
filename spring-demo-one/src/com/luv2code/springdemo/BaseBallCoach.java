package com.luv2code.springdemo;

public class BaseBallCoach implements Coach{
	
	//define the private Field for the Constructor
	private FortuneService fortuneService;
	
	//define the constructor dependency Injection
	BaseBallCoach(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkOut()
	{
		return "Baseball Return";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
	

}

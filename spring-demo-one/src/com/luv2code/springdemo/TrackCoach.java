package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneService;
	
	TrackCoach(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Track Coach Return";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}

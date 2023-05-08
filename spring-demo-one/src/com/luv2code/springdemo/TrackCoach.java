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
	
	//Bean Life Cycle - Adding init Method 
	public void doMyStartUpStuff()
	{
		System.out.println("In the Init-Method");
	}
	
	//Bean Life Cycle - Addingin Destroy Method.
	
	public void doMyCleanUpStuff()
	{
		System.out.println("In the Destroy Method");
	}

}

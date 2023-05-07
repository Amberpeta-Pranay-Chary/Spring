package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	protected String teamName;
	
	//Defining the setterMethod
	public CricketCoach()
	{
		System.out.println("Inside the CricketCoach Constructor");
	}	
	//Defining the setterMethod
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the Setter Method");
		this.fortuneService = fortuneService;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamName() {
		return teamName;
	}
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Cricket Class Dialy WorkOut";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}

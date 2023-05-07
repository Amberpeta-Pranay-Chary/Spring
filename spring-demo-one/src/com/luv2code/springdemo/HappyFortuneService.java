package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	HappyFortuneService()
	{
		System.out.println("Inside the Happy Fortune Service");
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "HappyFortuneService";
	}

}

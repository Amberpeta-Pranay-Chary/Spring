package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Base Ball WorkOut";
	}

}

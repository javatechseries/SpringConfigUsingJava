package com.explore.spring.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "1000 balls per day";
	}
	

}

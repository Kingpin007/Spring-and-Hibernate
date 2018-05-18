package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.err.println(">>Inside Default constructor - TennisCoach");
	}

	@Override
	public String getDailyWorkout() {
		return "Tennis workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

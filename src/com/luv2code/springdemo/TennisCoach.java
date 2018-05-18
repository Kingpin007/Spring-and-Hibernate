package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.err.println(">>Inside Default constructor - TennisCoach");
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	// Set fortune service
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.err.println(">>Inside setter for fortuneService");
		this.fortuneService = fortuneService;
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

package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortunes = { "Fortune 0", "Fortune 1", "Fortune 2", "Fortune 3" };
	private Random randomNumberGenerator = new Random();

	@Override
	public String getFortune() {
		int rand = randomNumberGenerator.nextInt()%4;
		return fortunes[rand];
	}

}

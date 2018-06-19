package com.pioneerx.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create array of strings
	private String[] data = {
			"red", "yellow", "blue", "green"
	};
	
	// random num gen
	private Random myRandom = new Random();
	

	@Override
	public String getFortune() {
		// pick a random string from array
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}

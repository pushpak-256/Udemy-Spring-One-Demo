package com.pushpak.springdemo.Coach;

import com.pushpak.springdemo.Fortune.FortuneService;

public class BaseBallCoach implements Coach {
	
	//Define private field for dependency 
	private FortuneService fortuneService;
	
	//Define constructor for constructor dependency injection
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "BB do tracking";
	}

	@Override
	public String getFortune() {
		//use helper class to get fortune
		return fortuneService.getDailyFortune();
	}

}

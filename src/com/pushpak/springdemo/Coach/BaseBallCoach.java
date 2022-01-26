package com.pushpak.springdemo.Coach;

import com.pushpak.springdemo.Fortune.ForturneService;

public class BaseBallCoach implements Coach {

	//define a private field for the dependency
	private ForturneService forturneService;
	
	//define a  constructor for dependency injection
	public BaseBallCoach(ForturneService forturneService) {
		this.forturneService = forturneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "{BB} do tracking";
	}

	@Override
	public String getFortune() {
		return "{BB}"+forturneService.getForturne();
	}

}

package com.pushpak.springdemo.Coach;

public class BaseBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "BB do tracking";
	}

	@Override
	public String getFortune() {
		return null;
	}

}

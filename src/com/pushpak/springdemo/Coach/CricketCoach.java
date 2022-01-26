package com.pushpak.springdemo.Coach;

import com.pushpak.springdemo.Fortune.ForturneService;

public class CricketCoach implements Coach {

	private ForturneService forturneService;
	
	public void setForturneService(ForturneService forturneService) {
		System.out.println("inside arg constructor taking in ref:ForturneService ");
		this.forturneService = forturneService;
	}

	@Override
	public String getDailyWorkout() {
		return "{crkt} swing bat";
	}

	public CricketCoach() {
		System.out.println("no arg");
	}

	@Override
	public String getFortune() {
		return "{crkt} "+forturneService.getForturne();
	}

}

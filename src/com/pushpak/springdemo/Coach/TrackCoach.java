package com.pushpak.springdemo.Coach;

import com.pushpak.springdemo.Fortune.ForturneService;

public class TrackCoach implements Coach {

	private ForturneService forturneService;
	
	public TrackCoach(ForturneService forturneService) {
		this.forturneService = forturneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Track Water intake";
	}

	@Override
	public String getFortune() {
		return "{TT} : "+forturneService.getForturne();
	}
	 
	//add an init method 
	public void init() {
		System.out.println("TT : inside init Method");
	}
	
	public void destroy () {
		System.out.println("TT : inside destroy Method");
	}
	
}

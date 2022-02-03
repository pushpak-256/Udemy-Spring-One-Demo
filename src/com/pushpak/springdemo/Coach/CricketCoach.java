package com.pushpak.springdemo.Coach;

import com.pushpak.springdemo.Fortune.FortuneService;

public class CricketCoach implements Coach {
   
	//Define private field for dependency 
	private FortuneService fortuneService;
	
	//setter method to set  dependency obj
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	//private fields for literal injections
	private String team;
	private String emailAddress;
	private String phone;
	private String city;
		
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	//Generate setter to set values form spring config file
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String getDailyWorkout() {
		return "crk: swing bat";
	}

	@Override
	public String getFortune() {
		return "[cricket]"+fortuneService.getDailyFortune();
	}

}

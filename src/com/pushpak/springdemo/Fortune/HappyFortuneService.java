package com.pushpak.springdemo.Fortune;

public class HappyFortuneService implements ForturneService {

	@Override
	public String getForturne() {
		return "Today is your LUCKY day :)";
	}

}

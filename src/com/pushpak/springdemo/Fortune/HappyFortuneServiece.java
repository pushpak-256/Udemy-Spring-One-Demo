package com.pushpak.springdemo.Fortune;

public class HappyFortuneServiece implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "[HappyFortuneServiece] Good Luck";
	}

}

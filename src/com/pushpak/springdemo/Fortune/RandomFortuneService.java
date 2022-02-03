package com.pushpak.springdemo.Fortune;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

	String [] fortuneArr =  new String [] {"Best of Luck","Just Do it", "Never Stay Down"};
	
	Random r = new Random();
	int index = r.nextInt(fortuneArr.length);
	
	@Override
	public String getDailyFortune() {
		return fortuneArr[index];
	}

}

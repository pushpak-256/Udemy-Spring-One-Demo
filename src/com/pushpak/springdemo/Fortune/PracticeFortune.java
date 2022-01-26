package com.pushpak.springdemo.Fortune;

import java.util.Random;

public class PracticeFortune implements ForturneService {

	String fortuneMessages [] = new String [] {"Just Do It ", "Good Day","Never Give Up"};
	Random r =new Random();
	int index = r.nextInt(fortuneMessages.length);
	
	@Override
	public String getForturne() {
		return fortuneMessages[index];
	}

}

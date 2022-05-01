package com.pushpak.springdemo.coach;

import com.pushpak.springdemo.fortuneServices.ForturneService;

public class CricketCoach implements Coach
{

    private ForturneService fortune ;
    
    public CricketCoach(ForturneService fortune) {
	//constructor injection
	this.fortune = fortune;
    }

    @Override
    public String getDailyWorkOut()
    {
	return "{CC} Swing bat 100 times";
    }

    @Override 
    public String getDailyForutune()
    {
	return fortune.getForturne();
    }

}

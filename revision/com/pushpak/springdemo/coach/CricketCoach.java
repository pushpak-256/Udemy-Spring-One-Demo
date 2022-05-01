package com.pushpak.springdemo.coach;

public class CricketCoach implements Coach
{

    @Override
    public String getDailyWorkOut()
    {
	return "{CC} Swing bat 100 times";
    }

    @Override 
    public String getDailyForutune()
    {
	return null;
    }

}

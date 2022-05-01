package com.pushpak.springdemo.coach;

public class BaseBallCoach implements Coach
{

    @Override
    public String getDailyWorkOut()
    {
	return "{BB} Run 100 meteres";
    }

    @Override 
    public String getDailyForutune()
    {
	return null;
    }

}

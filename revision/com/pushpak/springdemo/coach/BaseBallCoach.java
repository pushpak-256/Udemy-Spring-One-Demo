package com.pushpak.springdemo.coach;

import com.pushpak.springdemo.fortuneServices.ForturneService;

public class BaseBallCoach implements Coach
{
    public BaseBallCoach() {
	System.out.println("inside noArg BB");
    }

    // setter injection
    private ForturneService forturneService;

    public void setForturneService(ForturneService forturneService)
    {
	System.out.println("setting forturneService");
	this.forturneService = forturneService;
    }
    // setter injection end

    @Override
    public String getDailyWorkOut()
    {
	return "{BB} Run 100 meteres";
    }

    @Override 
    public String getDailyForutune()
    {
	return forturneService.getForturne();
    }

}

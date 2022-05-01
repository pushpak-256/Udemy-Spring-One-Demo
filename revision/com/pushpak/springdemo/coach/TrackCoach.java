package com.pushpak.springdemo.coach;

import com.pushpak.springdemo.fortuneServices.ForturneService;

public class TrackCoach  implements Coach
{
    //setter Injection 
    private ForturneService forturneService;
    
    public void setForturneService(ForturneService forturneService)
    {
        this.forturneService = forturneService;
    }

    @Override
    public String getDailyWorkOut()
    {
	return "{TT} Track Daily Water Intake";
    }

    @Override
    public String getDailyForutune()
    {
	return forturneService.getForturne();
    }

    //intit
    public void start()
    {
         System.out.println("Init Method called");
    }

    //destroy
    public void end()
    {
	System.out.println("Destory method called after spring container is close");
    }
    }

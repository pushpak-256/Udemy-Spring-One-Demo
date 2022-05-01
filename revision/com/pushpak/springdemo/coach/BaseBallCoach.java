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

    private String team ;
    private String email;
    private String coachName ;
    
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

    public String getTeam()
    {
        return team;
    }

    public void setTeam(String team)
    {
        this.team = team;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getCoachName()
    {
        return coachName;
    }

    public void setCoachName(String coachName)
    {
        this.coachName = coachName;
    }
}

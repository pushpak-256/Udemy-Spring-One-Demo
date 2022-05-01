package com.pushpak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springdemo.coach.BaseBallCoach;
import com.pushpak.springdemo.coach.Coach;

public class MyApp
{

    public static void main(String[] args)
    {
	//create spring container
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//Retrieve bean from container
	BaseBallCoach coach = context.getBean("baseBallCoach", BaseBallCoach.class);// change ID to get other Sports Coach,// ##configurable
	
	//use beans
	String workout = coach.getDailyWorkOut();
	String fortune = coach.getDailyForutune();
	System.out.println(workout+"\n"+fortune);
	
	//literal Injection
	System.out.println("\n\nName =" +coach.getCoachName());
	System.out.println("Team =" +coach.getTeam());
	System.out.println("Email =" +coach.getEmail());

	Coach bb1 = context.getBean("baseBallCoach",Coach.class); //scope : prototype
	Coach bb2 =  context.getBean("baseBallCoach",Coach.class); 
	
	Coach cc1 = context.getBean("cricketCoach",Coach.class); //scope : default(Singleton)
	Coach cc2 =  context.getBean("cricketCoach",Coach.class);
	
	System.out.println("\n\nAre baseBallCoach same = "+(bb1==bb2));
	System.out.println("Are cricketCoach same = "+(cc1==cc2));
	
	//close context
	context.close();
    }
}

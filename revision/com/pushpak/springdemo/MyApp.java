package com.pushpak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springdemo.coach.Coach;

public class MyApp
{

    public static void main(String[] args)
    {
	//create spring container
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//Retrieve bean from container
	Coach coach = context.getBean("cricketCoach", Coach.class);// change ID to get other Sports Coach,// ##configurable
	
	//use beans
	String workout = coach.getDailyWorkOut();
	System.out.println(workout);

	//close context
	context.close();
    }
}

package com.pushpak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springdemo.Coach.Coach;
import com.pushpak.springdemo.Coach.CricketCoach;

public class SetterInjection_DemoApp {

	public static void main(String[] args) {
		  
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from spring container
		CricketCoach ccCoach = context.getBean("cricketCoach", CricketCoach.class);

		// call method on bean
		System.out.println(ccCoach.getFortune());
        
		System.out.println("Team : "+ccCoach.getTeam()+"\nEmail : "+ccCoach.getEmailAddress());
		
		System.out.println("\nPhone : "+ccCoach.getPhone()+"\nCity :  "+ccCoach.getCity());
		
		// close context
		context.close();
		
	}

}

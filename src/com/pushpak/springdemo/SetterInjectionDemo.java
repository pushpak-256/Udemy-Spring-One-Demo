package com.pushpak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.pushpak.springdemo.Coach.CricketCoach;

public class SetterInjectionDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);

		// 3. call methods on the bean
		System.out.println(theCoach.getDailyWorkout() + "\n" + theCoach.getFortune());

		// 4. close the context
		context.close();
	}

}

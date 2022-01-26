package com.pushpak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springdemo.Coach.Coach;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("cricketCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());

		context.close();
	}

}

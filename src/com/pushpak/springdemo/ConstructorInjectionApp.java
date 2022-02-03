package com.pushpak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springdemo.Coach.Coach;

public class ConstructorInjectionApp {
	
	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from spring container
		Coach bbCoach = context.getBean("baseBallCoach", Coach.class);

		// call method on bean //get Random fortune #practicActivity2
		System.out.println(bbCoach.getFortune());

		// close context
		context.close();
	}

}

package com.pushpak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springdemo.Coach.BaseBallCoach;
import com.pushpak.springdemo.Coach.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config files
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrive bean from spring container
		Coach theCoach = context.getBean("baseBallCoach", Coach.class);
		Coach alphaCoach = context.getBean("baseBallCoach", Coach.class);
		
		//Testing by refering to implemention class insted of Coach (Interface) practiceActivity#3
        BaseBallCoach bbCoach = context.getBean("baseBallCoach", BaseBallCoach.class);  
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);

		// print res
		System.out.println("\nPointing to the same object :\t" + result);

		System.out.println("memory Location for- \t theCoach :\t" + theCoach);
		System.out.println("memory Location for- \t alphaCoach :\t" + alphaCoach);
		System.out.println("memory Location for- \t bbCoach :\t" + bbCoach);
		
		//Closing context
		context.close();
		
	}

}

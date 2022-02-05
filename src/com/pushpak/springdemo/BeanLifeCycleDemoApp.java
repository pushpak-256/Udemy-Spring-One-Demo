package com.pushpak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springdemo.Coach.BaseBallCoach;
import com.pushpak.springdemo.Coach.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// load spring config files
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		// retrive bean from spring container
		Coach ttCoach = context.getBean("trackCoach", Coach.class);
		
        //Use Bean 
		System.out.println(ttCoach.getDailyWorkout()+"\t"+ttCoach.getFortune());
		
		//Closing context
		context.close();
		
	}

}

package com.pushpak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springdemo.Coach.Coach;

public class MyApp {

	public static void main(String[] args) {
       
		//1. load the spring config file
		ClassPathXmlApplicationContext context
		= new ClassPathXmlApplicationContext("applicationContext.xml");
       
		//2. retrieve bean from spring container
		Coach theCoach = context.getBean("baseBallCoach", Coach.class);
        
		//3. call methods on the bean
		System.out.println(theCoach.getDailyWorkout()+"\n"+theCoach.getFortune());
		
        //4. close the context
		context.close();
	}

}

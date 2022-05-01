package com.pushpak.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pushpak.springdemo.coach.Coach;

public class BeanLifeCycleDemo
{

    public static void main(String[] args)
    {
	//load Spring container
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext2.xml");
	
        //Retrieve beans
       Coach coach = context.getBean("trackCoach", Coach.class);
       
       //use methods on beans
       System.out.println(coach.getDailyForutune()+"\n"+coach.getDailyWorkOut());
       
       //close container
       context.close();
    }
}

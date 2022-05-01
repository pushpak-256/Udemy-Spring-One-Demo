package com.pushpak.springdemo.fortuneServices;

public class LuckyFortune implements ForturneService
{

    @Override
    public String getForturne()
    {
	return "{LuckyFortune} Today is your Lucky Day";
    }

}

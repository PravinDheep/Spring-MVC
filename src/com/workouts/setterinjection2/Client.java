package com.workouts.setterinjection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	  ApplicationContext ap	= new ClassPathXmlApplicationContext("resources/setterinjection2.xml");
	  Test t = (Test)ap.getBean("si");
	  t.hello("Pravin");
	}
}
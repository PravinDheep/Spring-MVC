package com.workouts.dependsOn12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/dependsOn12.xml");
		
		//ap.getBean(a);
	}

}

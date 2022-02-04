package com.workouts.setterMandatoryDependencyCheck11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workouts.requiredPropertiesDependencyInjection10.Test;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("/resources/setterMandatoryDependencyCheck11.xml");
		
		Test t = (Test) ap.getBean("t");
		t.printData();
	}
}

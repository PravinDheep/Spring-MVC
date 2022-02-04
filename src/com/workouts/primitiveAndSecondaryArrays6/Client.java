package com.workouts.primitiveAndSecondaryArrays6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("/resources/primitiveAndSecondaryArrays6.xml");
		Car car = (Car) ap.getBean("c");
		car.printCarData();
	}
}

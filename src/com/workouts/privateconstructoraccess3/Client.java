package com.workouts.privateconstructoraccess3;

import java.lang.reflect.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("com.workouts.privateconstructoraccess.Test");
			Constructor[] con = c.getDeclaredConstructors();
			con[0].setAccessible(true);
			con[0].newInstance(args);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("resources/privateconstructoraccess3.xml");
		Test t = (Test) ac.getBean("tpc");
		t.hello();
	}
}

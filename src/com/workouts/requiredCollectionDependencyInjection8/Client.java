package com.workouts.requiredCollectionDependencyInjection8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		/* 
		 * Schema Based Configuration supports only j2ee container(ApplicationContext ap = new ClassPathXmlApplicationContext()), 
		 * it doesn't support core container(BeanFactory b = new XmlBeanFactory(r)).
		 */
		ApplicationContext ap = new ClassPathXmlApplicationContext("/resources/requiredCollectionDependencyInjection8.xml");
		
		Test t = (Test) ap.getBean("t");
		
		t.printData();
	}
}

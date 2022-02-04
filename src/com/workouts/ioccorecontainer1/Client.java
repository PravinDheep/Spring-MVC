package com.workouts.ioccorecontainer1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String[] args) {
		//Resource r = new ClassPathResource("resources/spring.xml");
		//BeanFactory b = new XmlBeanFactory(r); //Core container under IOC
		ApplicationContext b = new ClassPathXmlApplicationContext("resources/ioccorecontainer1.xml"); // J2EE container under IOC
		
		//Only once the object will be created inspite of calling multiple times when the scope is singleton
		Object obj = b.getBean("tioc");
		
		Object obj1 = b.getBean("tioc");
		
		System.out.println(obj==obj1);
		Test t = (Test) obj;
		t.hello();
	}
	
}

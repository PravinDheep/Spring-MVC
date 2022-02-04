package com.workouts.constructorinjection4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workouts.setterinjectionforsecondary5.Car;

public class Client {

	public static void main(String[] args) {
	  ApplicationContext ap	= new ClassPathXmlApplicationContext("resources/constructorinjection4.xml");
	  
	  System.out.println("---------------------------------------------------------------------------");
	  System.out.println(">>>>>getBean(String arg0)>>>>11111");
	  Test t = (Test)ap.getBean("cite");
	  t.hello("Pravin");
	  
	  System.out.println(">>>>>getBean(String arg0, Object... arg1)>>>>22222");
	  Test t1 = (Test)ap.getBean("cite", "Mrs.","Female","24");
	  t1.hello("Sunitha");
	  
	  System.out.println(">>>>>getBean(Class<T> arg0, Object... arg1)>>>>55555");
	  Test t4 = (Test)ap.getBean("cite",Test.class);
	  t4.hello("Pradeep");
	  
	/*
	 * System.out.println(">>>>>getBean(Class<T> arg0)>>>33333"); Test t2 =
	 * (Test)ap.getBean(Test.class); t2.hello("Praveen");
	 */
	  
		/*
	 * System.out.println(">>>>>getBean(Class<T> arg0, Object... arg1)>>>>44444");
	 * Test t3 = (Test)ap.getBean(Test.class, "Mr.","Male","28");
	 * t3.hello("PravinDheep");
	 */
	  
	 System.out.println("---------------------------------------------------------------------------");
	  
	  
	  
	}
}
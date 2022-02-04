package com.workouts.setterinjectionforsecondary5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		/* In Case if we have two xml files.
		 * String files[] = new String[]{"resources/setterinjectionforsecondary.xml", "resources/car.xml"};
		 */
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/setterinjectionforsecondary5.xml");
		Car car = (Car) ap.getBean("SIFS");
		car.printCarData();
	}
}

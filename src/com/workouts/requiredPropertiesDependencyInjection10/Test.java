package com.workouts.requiredPropertiesDependencyInjection10;

import java.util.Properties;
import java.util.Set;

public class Test {
	private Properties driver;

	public Properties getDriver() {
		return driver;
	}

	public void setDriver(Properties driver) {
		this.driver = driver;
	}

	public void printData() {
		Set<Object> keys = driver.keySet();
		System.out.println("Loading properties file from class path resource.");
		for(Object key : keys) {
			System.out.println(key + " : " + driver.getProperty(key.toString()));
		}
		
	}
}
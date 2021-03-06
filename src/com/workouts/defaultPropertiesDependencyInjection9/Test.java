package com.workouts.defaultPropertiesDependencyInjection9;

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
		
		for(Object key : keys) {
			System.out.println(key + " : " + driver.getProperty(key.toString()));
		}
		
	}
}
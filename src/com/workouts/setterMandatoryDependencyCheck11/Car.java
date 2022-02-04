package com.workouts.setterMandatoryDependencyCheck11;

import org.springframework.beans.factory.annotation.Required;

public class Car {
	private String carName;
	private Engine engine;
	
	
	@Required
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarName() {
		return carName;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void printData() {
		System.out.println("Car Name: " + carName + " - Model: " + engine.getModelyear());
	}
}

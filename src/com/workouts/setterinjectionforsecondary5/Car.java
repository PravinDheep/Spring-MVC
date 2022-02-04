package com.workouts.setterinjectionforsecondary5;

public class Car {

	private String carName;
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	private Engine engine;
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printCarData() {
		System.out.println("Carname: " + carName);
		System.out.println("Model: " + engine.getModel());
	}
}

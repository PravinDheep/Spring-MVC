package com.workouts.primitiveAndSecondaryArrays6;

public class Car {
	private String carNames[];
	private Engine engines[];
	
	public String[] getCarNames() {
		return carNames;
	}
	public void setCarNames(String[] carNames) {
		this.carNames = carNames;
	}
	public Engine[] getEngines() {
		return engines;
	}
	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	
	public void printCarData() {
		for(String carname : carNames) {
			System.out.println(carname + "\n");
		}
		for(Engine engine : engines) {
			System.out.println(engine.getModelYear() + "\n");
		}
	}
}

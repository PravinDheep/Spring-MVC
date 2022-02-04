package com.workouts.defaultCollectionDependencyInjection7;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	private List<Object> fruits;
	private Set<Object> cricketers;
	private Map<Object, Object> countriesandcapitals;
	public List<Object> getFruits() {
		return fruits;
	}
	public void setFruits(List<Object> fruits) {
		this.fruits = fruits;
	}
	public Set<Object> getCricketers() {
		return cricketers;
	}
	public void setCricketers(Set<Object> cricketers) {
		this.cricketers = cricketers;
	}
	public Map<Object, Object> getCountriesandcapitals() {
		return countriesandcapitals;
	}
	public void setCountriesandcapitals(Map<Object, Object> countriesandcapitals) {
		this.countriesandcapitals = countriesandcapitals;
	}
	
	public void printData() {
		System.out.println("Fruits..............");
		for(Object fruit : fruits) {
			System.out.print(fruit + ", \t");
		}
		System.out.println();
		System.out.println("Cricketers......");
		for(Object cricketer : cricketers) {
			System.out.print(cricketer + ", \t");
		}
		System.out.println();
		System.out.println("Countries And Capitals.............");
		Set keys = countriesandcapitals.keySet();
		for(Object key : keys) {
			System.out.println("Country: " + key.toString() + " - " + "Capital: " + countriesandcapitals.get(key.toString()));
		}

	}
	
}

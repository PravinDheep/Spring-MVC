package com.workouts.requiredCollectionDependencyInjection8;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	private Vector fruits;
	private TreeSet cricketers;
	private Hashtable countriesandcapitals;
	
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	
	public Vector getFruits() {
		return fruits;
	}
	
	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}
	
	public TreeSet getCricketers() {
		return cricketers;
	}
	
	public void setCountriesandcapitals(Hashtable countriesandcapitals) {
		this.countriesandcapitals = countriesandcapitals;
	}
	
	public Hashtable getCountriesandcapitals() {
		return countriesandcapitals;
	}
	
	
	
	public void printData() {
		System.out.println("Fruits.............");
		for(Object fruit : fruits) {
			System.out.println(fruit + "\t");
		}
		
		System.out.println();
		System.out.println("Cricketers.............");
		for(Object cricketer : cricketers) {
			System.out.println(cricketer + "\t");
		}
		
		System.out.println();
		System.out.println("Countries And Capitals.............");
		Set keys = countriesandcapitals.keySet();
		for(Object key : keys) {
			System.out.println("Country: " + key.toString() + " - " + "Capital: " + countriesandcapitals.get(key.toString()));
		}
		
	}
}
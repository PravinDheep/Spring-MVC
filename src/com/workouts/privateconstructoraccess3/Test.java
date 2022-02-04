package com.workouts.privateconstructoraccess3;

public class Test {
	private Test(){
		System.out.println("Test.. Private Constructor");
	}
	public void hello() {
		System.out.println("HelloWorld from Private Constructor Class");
	}
}
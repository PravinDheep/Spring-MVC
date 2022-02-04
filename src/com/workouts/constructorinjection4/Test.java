package com.workouts.constructorinjection4;

public class Test {
	
	private String titleOfAddress;
	private int age;
	private String gender;
	
	Test(String gender){
		this.gender = gender;
		System.out.println(this.gender + "(1)>>>>>>str");
	}
	
	Test(int id){
		this.age = age;
		System.out.println(this.age + "(2)>>>>>>int");
	}
	
	Test(String gender, int age){
		this.gender = gender;
		this.age = age;
		System.out.println(this.gender + "(3)>>>>>>" + this.age);
	}
	
	Test(String titleOfAddress, String gender, int age){
		this.gender = gender;
		this.age = age;
		this.titleOfAddress = titleOfAddress;
		System.out.println(this.titleOfAddress + " <<<" + this.gender + "(3)>>>>>>" + this.age);
	}
	
	public void hello(String name) {
		Object value = (gender == null) ? age : gender; 
		System.out.println("(4)Hello " + this.titleOfAddress + " " + name + " " + value.toString());
	}
}

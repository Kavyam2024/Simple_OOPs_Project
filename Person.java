package com;

public class Person {
	String name;
	int age;
	char gender;
	Person(String name, int age,char gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	void displayDetails() {
		System.out.println("Name:"+name+" Age:"+age+" Gender:"+gender);
	}
}

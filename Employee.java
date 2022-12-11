package com;

public class Employee extends Person {
	int id;
	double salary;
	String designation;
	
	Employee(String name,int age,char gender,int id,double salary,String designation){
		super(name,age,gender);
		this.id=id;
		this.salary=salary;
		this.designation=designation;
	}
	void displaydetails() {
		System.out.println("Name: "+name+" Age: "+age+" Gender: "+gender+" Id: "+id+" Salary: "+salary+" Designation: "+designation);
	}
}


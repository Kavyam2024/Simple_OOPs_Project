package com;

public class Student extends Person{
	String usn;
	double marks;
	String college;
	Student(String name,int age,char gender,String college,String usn,double marks){
		super(name,age,gender);
		this.usn=usn;
		this.marks=marks;
		this.college=college;
	}
	void displayDetails() {
		System.out.println("Name: "+name+" Age: "+age+" Gender: "+gender+
				" USN :"+usn+" Marks: "+marks+" Collegs: "+college);
	}
}

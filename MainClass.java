package com;

public class MainClass {

	public static void main(String[] args) {
		Person p1= new Person("Ram",25,'M');
		p1.displayDetails();

		Student s1= new Student("Laksh",19,'F',"BMSC","CS001",67.56);
		s1.displayDetails();

		Employee e1= new Employee("Anjan",26,'M',1233,45000,"Developer");
		e1.displaydetails();

	}

}

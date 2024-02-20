package com.feb20;

/* Write a program to print the names of students by creating a Student class.
 * If no name is passed while creating an object of Student class,
 * then the name should be "Unknown", otherwise the name should be equal
 * to the String value passed while creating object of Student class.
 */



public class Student {

	String name;
	
	Student()	{
		name = "Unknown";
	}
	
	Student(String name)	{
		this.name = name;
	}
	
	public static void main(String[] args)	{
		Student s = new Student("Ajita Gupta");
		System.out.println(s.name);
				
	}
	
}

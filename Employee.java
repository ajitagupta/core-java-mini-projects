package com.jan31;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter Salary/Day:");
		int salPerDay=sc.nextInt();

		System.out.println("Attendance:");
		int attendance=sc.nextInt();
		
		int salary = salPerDay*attendance;
		
		if (salary>100000)	System.out.print("Hi " + name +", your designation is Team Leader");
		else if (80000<salary && salary<=100000)	System.out.print("Hi " + name + ", your designation is Senior Developer");
		else if (60000<salary && salary<=80000)	System.out.print("Hi " + name +", your designation is Junior Developer");
		else if (40000<salary && salary<=60000)	System.out.print("Hi " + name +", your designation is Trainee");
		else 	System.out.print("Hi " + name +", your designation is Junior Developer");

	}

}

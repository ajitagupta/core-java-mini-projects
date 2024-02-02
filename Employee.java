package com.jan31;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name:");
		String name = sc.nextLine();

		System.out.println("Enter Salary/Day:");
		int salPerDay = sc.nextInt();

		System.out.println("Attendance in Days of that Month:");
		int attendance = sc.nextInt();

		int salary = salPerDay * attendance;
		System.out.println(salary);

		if (salary >= 10000) {
			System.out.print("Hi " + name + ", your designation is Team Leader");
		} else if (8000 >= salary && salary < 10000) {
			System.out.print("Hi " + name + ", your designation is Senior Developer");
		} else if (6000 >= salary && salary < 8000) {
			System.out.print("Hi " + name + ", your designation is Junior Developer");
		} else if (4000 >= salary && salary < 6000) {
			System.out.print("Hi " + name + ", your designation is Trainee");
		} else {
			System.out.print("Hi " + name + ", your designation is Clerk");
		}

	}

}

package com.mar1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDefinedArrayList {

	
	public static void main(String[] args)	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers would you like to add? ");
		int n = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i<n; i++)
		{
			System.out.println("Please enter your number: ");
			al.add(sc.nextInt());
		}
		
		al.forEach(j->System.out.println(j));
	}
}

package jan30;

import java.util.Scanner;

public class Book {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter value for name:");
		String name=sc.nextLine();

		System.out.println("Enter value for author:");
		String author=sc.nextLine();
		
		System.out.println("Enter value for published or not (true/false):");
		boolean published=sc.nextBoolean();
		
		System.out.println("Book name: " + name);
		System.out.println("Author name: " + author);
		System.out.println("Published: " + published);
		
	}

}

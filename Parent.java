package com.feb19;

/* Create an abstract class 'Parent' with a method 'message'.
 * It has two subclasses each having a method with the same name 'message'
 * that prints "This is first subclass" and "This is second subclass"
 * respectively. Call the methods 'message' by creating an object for each subclass.
 */

abstract class Parentt {
	abstract void message();
}

class Subclass1 extends Parentt {

	@Override
	void message() {
		System.out.println("This is first subclass");
	}

}

class Subclass2 extends Parentt {

	@Override
	void message() {
		System.out.println("This is second subclass");

	}

}

public class Test5 {

	public static void main(String[] args) {

		Subclass1 sub1 = new Subclass1();
		sub1.message();
		Subclass2 sub2 = new Subclass2();
		sub2.message();
	}

}

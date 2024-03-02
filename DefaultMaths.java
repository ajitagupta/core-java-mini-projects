package com.mar1;

interface Maths {
	default void add(int a, int b) {
		System.out.println(a + b);
	}
}

class Demo implements Maths {

}

public class DefaultMaths {
	public static void main(String args[]) {
		Demo d1 = new Demo();

	}

}

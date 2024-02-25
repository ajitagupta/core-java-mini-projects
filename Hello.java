package com.feb25;

@FunctionalInterface
interface Hello {

	public void sayHi();

	// public void jump();
}

public class LambdaExpressionWithNoParameter {

	public static void main(String[] args) {

		Hello h1 = () -> System.out.println("Hi hello h r u??");

		h1.sayHi();
	}

}

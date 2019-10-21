package com.core.java.lambda.expression;

interface InterfaceUsedForAnonymousClass{
	public void introduction();
}

class Person{
	public void introduce(InterfaceUsedForAnonymousClass intro) {
		intro.introduction();
	}
}

public class Lambda {
	

	public static void main(String[] args) {
		/*
		 * The purpose of lambda expression is to be able to pass some code, such as method to another method. Before Java 8 it was
		 * common to create an interface a then based on that interface pass the code as anonymous class. To know the differences, here
		 * we first use an anonymous class and then an lambda expression equivalent. 
		 */
		Person person = new Person();
		person.introduce(new InterfaceUsedForAnonymousClass() {

			@Override
			public void introduction() {
				System.out.println("Hello, I'm a person");
				
			}
			
		});
	}

}

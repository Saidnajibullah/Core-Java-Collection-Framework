package com.core.java.passingbyvalue;

public class PassingByValueOrReference {
	
	
	//======================= In Java we don't have anything passed by reference. Everything is passed by value ===================//

	public static int value = 23;
	public static void main(String[] args) {
		
		PassingByValueOrReference pbv = new PassingByValueOrReference();
		
		Person person = new Person(45);
		
		//============== Primitive type passing by value ===================//
		System.out.println("The original value is: " + value);
		pbv.show(value);
		System.out.println("The original value after the show method gets executed is: " + value);
		
		
		//============== Object type passing by value ===================//
		System.out.println("The original person is: " + person);
		pbv.show(person);
		System.out.println("The original value after the show method gets executed is: " + person);
	}
	
	public void show(int value) {
		System.out.println("The original value passed to show method is: " + value);
		value = 40;
		System.out.println("The original value passed and changed inside the show method is: " + value);
	}
	
	public void show(Person person) {
		System.out.println("The original person passed to show method is: " + person);
		person = new Person(89);
		System.out.println("The original person passed and changed inside the show method is: " + person);
	}

}

package com.java.core.personal.project.doloop;

import java.util.Scanner;

public class DoLoop {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		//with do while loop we do not need the first line of code which helps prevent code duplication.
//		System.out.println("Enter the required number ");
//		int number = input.nextInt();
//		while(number != 10) {
//			System.out.println("Enter the required number ");
//			number = input.nextInt();
//		}
//		System.out.println("You successfuly entered the required number which is " + number);
		
		int number = 0;
		do{
			System.out.println("Enter the required number ");
			number = input.nextInt();
		}while(number != 10);
		System.out.println("You successfuly entered the required number which is " + number);

	}

}

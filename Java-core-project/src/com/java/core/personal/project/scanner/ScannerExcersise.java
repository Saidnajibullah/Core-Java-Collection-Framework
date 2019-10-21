package com.java.core.personal.project.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExcersise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean stringInput = false;
		while(! stringInput) {
			try {
				System.out.println("Please enter you name ");
				int name = scanner.nextInt();
				stringInput = true;
				System.out.println("your number is " + name);
			}catch(InputMismatchException e) {
				System.out.println(e);
				stringInput = false;
				scanner.nextLine();
			}
		}

	}

}

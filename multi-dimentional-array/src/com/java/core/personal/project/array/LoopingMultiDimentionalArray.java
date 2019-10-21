package com.java.core.personal.project.array;

public class LoopingMultiDimentionalArray {

	public static void main(String[] args) {
		
		//first way of declaring and initializing array in Java.
		String[][] stringArray = new String[2][3];
		stringArray[0][0] = "firstname1";
		stringArray[0][1] = "lastname1";
		stringArray[0][2] = "email1";
		stringArray[1][0] = "zip1";
		stringArray[1][1] = "phone1";
		stringArray[1][2] = "job1";
		
		//second way of declaring and initializing array in Java.
		String[][] stringArray1 = {
				{"firstname", "lastname", "email"},
				{"zip", "phone", "job"}
		};
		
		for (int row = 0; row < stringArray.length; row++) {
			for(int col = 0; col < stringArray[row].length; col++) {
				System.out.println(stringArray[row][col]);
			}
		}
		
		for (int row = 0; row < stringArray1.length; row++) {
			for(int col = 0; col < stringArray1[row].length; col++) {
				System.out.println(stringArray1[row][col]);
			}
		}

	}

}

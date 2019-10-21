package com.core.java.personal.project.deserializing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.core.java.personal.project.person.Person;

public class Deserializing {

	public static void main(String[] args) {
		System.out.println("Deserializing...");
		
		try(FileInputStream fs = new FileInputStream("people.bin")){
			
			ObjectInputStream is = new ObjectInputStream(fs);
			
			//casting is necessary; otherwise you will get compile error.
			Person person1 = (Person) is.readObject();
			Person person2 = (Person) is.readObject();
			
			System.out.println(person1);
			System.out.println(person2);
			
			System.out.println("deserializing array of objects");
			
			Person[] peoples = (Person[]) is.readObject();
			
			System.out.println("person1 from array: " + peoples[0]);
			System.out.println("person2 from array: " + peoples[1]);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

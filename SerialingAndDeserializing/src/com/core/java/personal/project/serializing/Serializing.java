package com.core.java.personal.project.serializing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.core.java.personal.project.person.Person;

public class Serializing {

	public static void main(String[] args) {
		Person person1 = new Person(2, "Najib");
		Person person2 = new Person(5, "Asad");
		System.out.println(person1);
		System.out.println(person2);
		
		///////to create the file where we want our objects to be serialized.///////
		///////static fields are not serialized because they belong to the class no to a specific object.///////
		///////the constructor of a class is not serialized as well.///////
		
		//this file will be create inside our project folder.s
		File file = new File("people.bin");
		
		//serializing the object as sequence of bits.
		
		//this kind of try is the Java 7 feature. using this we do not need to manually close the steam.
		try(FileOutputStream fs = new FileOutputStream(file)){
			
			//this object enables us to actually serialize the objects.
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(person1);
			os.writeObject(person2);
			
			//since an array is also object in Java, we can serialize and deserialize it the normal way.
			
			System.out.println("serializing array of objects");
			
			Person[] peoples = {person1, person2};
			os.writeObject(peoples);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

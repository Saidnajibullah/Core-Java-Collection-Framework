package com.java.core.personal.project.generic;

import java.util.ArrayList;
import java.util.List;


class Machine{

	@Override
	public String toString() {
		return "I'm a machine";
	}
	
}

class Camera{

	@Override
	public String toString() {
		return "I'm a camera";
	}
	
}

public class Generics {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add(new Machine());
		list.add(new Camera());
		showListEements(list);
	}
	
	public static void showListEements(List<?> list) {
		for(Object element: list) {
			System.out.println(element);
		}
	}


}

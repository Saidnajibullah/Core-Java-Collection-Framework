package com.core.java.personal.project.anonymous;


class Machine{
	public void start() {
		System.out.println("Machine starts");
	}
}

interface Plant{
	public void grow();
}

public class AnonymousClassExample {

	public static void main(String[] args) {
		
		//anonymous class. we create an instance of the Machine class and override it's start method.
		Machine camera = new Machine() {
			@Override
			public void start() {
				System.out.println("Camera starts...");
			}
		};
		camera.start();
		
		//anonymous implementation of interface.
		
		Plant plant = new Plant() {

			@Override
			public void grow() {
				System.out.println("The plant is growing fast...");
				
			}
			
		};
		plant.grow();

	}

}

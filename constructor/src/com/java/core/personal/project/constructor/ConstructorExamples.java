package com.java.core.personal.project.constructor;

public class ConstructorExamples {
	private String defaultValue;

	// in Java we can have multiple constructors;
	public ConstructorExamples() {
		// we can use constructors to add default values to variables.
		this.defaultValue = "some default value";
		System.out.println("this is the No-arg connstructor");
		System.out.println("this is the default value: " + this.defaultValue);
	}

	public ConstructorExamples(String oneArg) {
		// we can use the this(0 or more args) to call a constructor inside other
		// constructor.
		// in this case, it should be the first line of code inside the calling
		// constructor.
		this("arg1 of constructor called inside other one", "arg2 of constructor called inside other one");
		System.out.println("this is the " + oneArg + " constructor");
	}

	public ConstructorExamples(String arg1, String arg2) {
		System.out.println("this is the constructor with tow arguments: " + arg1 + " " + arg2);
	}

	public static void main(String[] args) {
		new ConstructorExamples();
		new ConstructorExamples("one argument");
		new ConstructorExamples("argment one", "argument two");
	}

}

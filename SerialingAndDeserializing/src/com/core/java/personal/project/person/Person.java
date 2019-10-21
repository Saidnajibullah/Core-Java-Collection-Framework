package com.core.java.personal.project.person;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	//if don't want some of the fields of a serializable class, you use the transient keyword.
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}

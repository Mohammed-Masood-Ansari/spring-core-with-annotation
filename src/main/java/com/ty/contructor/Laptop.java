package com.ty.contructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	String name;

	public Laptop(@Value(value = "abhi") String name) {
		super();
		this.name = name;
	}
	
	public void getLaptop() {
		System.out.println("laptopName = "+name);
	}
}

package com.ty.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	int id;
	String name;
	
	@Value(value = "098")
	public void setId(int id) {
		this.id = id;
	}
	
	@Value(value = "preeti")
	public void setName(String name) {
		this.name = name;
	}

	public void getEmployee() {
		System.out.println("id ="+id);
		System.out.println("name ="+name);
	}
}

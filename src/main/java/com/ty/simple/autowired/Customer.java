package com.ty.simple.autowired;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	public void getCustomer() {
		System.out.println("customer is searching for users");
	}
}

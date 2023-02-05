package com.ty.setter.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

	Customer customer;
	
	
	@Autowired
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public void getUser() {
		
		System.out.println("user is searching for customer.....");
		
		customer.getCustomer();
	}
}

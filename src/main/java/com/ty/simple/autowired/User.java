package com.ty.simple.autowired;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.setter.autowired.Customer;
@Component
public class User {
	@Autowired
	com.ty.simple.autowired.Customer customer;

	public void getUser() {

		System.out.println("user is searching for customer.....");

		customer.getCustomer();
	}
}

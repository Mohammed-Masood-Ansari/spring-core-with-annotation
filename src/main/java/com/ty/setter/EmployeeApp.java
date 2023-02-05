package com.ty.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;

public class EmployeeApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Employee employee = (Employee)applicationContext.getBean("employee");
		employee.getEmployee();
	}
}

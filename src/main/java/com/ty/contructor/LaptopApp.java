package com.ty.contructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;
import com.ty.simple.Student;

public class LaptopApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Laptop laptop = (Laptop)applicationContext.getBean("laptop");
		laptop.getLaptop();
	}
}

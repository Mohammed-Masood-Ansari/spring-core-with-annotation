package com.ty.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;

public class StudentApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Student student = (Student)applicationContext.getBean("student");
		student.getStudent();
	}
}

package com.ty.contructor.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;

public class BirdsApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Bird bird = (Bird)applicationContext.getBean("bird");
		
		bird.getBird();
	}
}

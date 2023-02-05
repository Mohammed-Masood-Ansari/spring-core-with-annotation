package com.ty.contructor.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bird {

	@Autowired
	Wing wing;

	
	public Bird(Wing wing) {
		super();
		this.wing = wing;
	}
	
	public void getBird() {
		System.out.println("birds are flying.....and");
		wing.getWing();
	}
}

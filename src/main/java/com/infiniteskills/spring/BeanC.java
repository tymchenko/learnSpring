package com.infiniteskills.spring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public class BeanC {
	
	private String message;

	public String getMessage() {
		return message;
	}
	
	public void setMessage(@Value("Autowiring in Java")String message) {
		this.message = message;
	}
}

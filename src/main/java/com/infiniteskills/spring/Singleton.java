package com.infiniteskills.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class Singleton implements ApplicationContextAware{
	
	private Prototype prototype;
	private ApplicationContext context;
	
	public abstract Prototype createPrototype();
	
	public void setPrototypr(Prototype prototype){
		this.prototype=prototype;
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
	}

}

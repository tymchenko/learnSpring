package com.infiniteskills.spring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BeanA {
		
	private BeanB beanB;
	
	@Autowired
	public BeanA(BeanB beanB){
		this.beanB=beanB;
	}
	
	public void execute(){
		System.out.println(this.beanB.getBeanC().getMessage());
	}
	
}

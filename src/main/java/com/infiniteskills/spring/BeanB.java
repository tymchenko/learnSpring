package com.infiniteskills.spring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class BeanB {
	
	private BeanC beanC;

	public BeanC getBeanC() {
		return beanC;
	}
	
	@Autowired
	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}

}
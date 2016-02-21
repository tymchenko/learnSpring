package com.infiniteskills.spring;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		BeanA beanA = context.getBean("beanA", BeanA.class);
		beanA.execute();
	}
}
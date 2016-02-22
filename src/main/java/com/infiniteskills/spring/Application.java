package com.infiniteskills.spring;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Application {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//		ApplicationContext context = new ClassPathXmlApplicationContext("config/application-context.xml", "another-context.xml");
		BeanA beanA = context.getBean("beanA", BeanA.class);
		 
		 System.out.println(beanA.getBeanB().getMessage());


		
	}
}
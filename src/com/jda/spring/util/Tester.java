package com.jda.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jda.spring.beans.Shape;

public class Tester {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
	 Shape app = (Shape) context.getBean("myBean");
		System.out.println(app.getName());
			
		}
}

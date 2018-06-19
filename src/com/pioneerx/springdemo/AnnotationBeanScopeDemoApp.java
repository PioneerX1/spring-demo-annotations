package com.pioneerx.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		Coach betaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are same
		boolean result = (alphaCoach == betaCoach);
		System.out.println("Pointing to same object? " + result);
		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		System.out.println("Memory location for betaCoach: " + betaCoach);	
		
		// close context
		context.close();
	}

}

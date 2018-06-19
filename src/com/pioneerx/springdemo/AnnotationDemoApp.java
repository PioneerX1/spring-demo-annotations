package com.pioneerx.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// load spring context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean
		//Coach coach = context.getBean("sillyCoach", Coach.class);
		
		// retrieve bean with default bean id
		Coach coach = context.getBean("cricketCoach", Coach.class);
		//Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
		
		// call method on bean
		System.out.println(coach.getDailyWorkout());
		//System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		// close context
		context.close();

	}

}

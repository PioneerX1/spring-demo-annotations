package com.pioneerx.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// load spring context
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean with default bean id
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		// call method on bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		// call swim coach specific methods
		System.out.println("email: " + coach.getEmail());
		System.out.println("team: " + coach.getTeam());
		
		// close context
		context.close();

	}

}

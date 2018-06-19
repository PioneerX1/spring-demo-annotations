package com.pioneerx.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component without ("sillyCoach") means it uses default bean id
@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")	// needed if more impl for FS added
	private FortuneService fortuneService;
	
	public TennisCoach() {
		// default constructor for setter injection
		System.out.println(">> inside default constructor");
	}
	
	// define init method
	@PostConstruct
	public void doStartUp() {
		System.out.println(">> TennisCoach: inside init method");
	}
	
	// define destroy method
	@PreDestroy
	public void doCleanUp() {
		System.out.println(">> TennisCoach: inside destroy method");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practice backhand volley.";
	}
	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//		System.out.println(">> inside setter injector - doSomeCrazyStuff()");
//	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

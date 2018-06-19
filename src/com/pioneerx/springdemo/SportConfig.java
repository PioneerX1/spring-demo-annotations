package com.pioneerx.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * This class replaces XML or Annotation based injection
 * @author micksexton
 *
 */
@Configuration
// @ComponentScan("com.pioneerx.springdemo")  - not needed since using @Bean below
@PropertySource("classpath:newSport.properties")	// needed for @Values in SwimCoach
public class SportConfig {
	
	// define bean for sadFortuneService
	@Bean
	public FortuneService sadFortuneService() {		// this is the bean id
		return new SadFortuneService();
	}
	
	// define bean for swimCoach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());	// this matches sadFortuneService() bean method
	}
	
}

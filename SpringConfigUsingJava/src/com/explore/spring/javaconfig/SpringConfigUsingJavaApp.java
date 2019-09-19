package com.explore.spring.javaconfig;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringConfigUsingJavaApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctxt= new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		  Coach baseballCoach=ctxt.getBean("baseballCoach", Coach.class);
		  System.out.println("Baseball Coach: "+baseballCoach.getDailyWorkout());
		
		  
		 
		
		ctxt.close();

	}

}

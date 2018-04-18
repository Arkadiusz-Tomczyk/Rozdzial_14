package com.crud.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class TasksApplication extends SpringBootServletInitializer{
	//bez tomcat
	public class TasksApplication {

		public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}
//dla tomcat
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(TasksApplication.class);
//	}
}

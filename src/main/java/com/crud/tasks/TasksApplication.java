package com.crud.tasks;

import com.crud.tasks.domain.TaskDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

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
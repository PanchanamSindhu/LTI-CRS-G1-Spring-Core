package com.lt.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.lt.configuration.AdminConfig;
import com.lt.configuration.ProfessorConfig;
import com.lt.configuration.StudentConfig;
import com.lt.configuration.UserConfig;
import com.lt.service.AdminService;

@SpringBootApplication
@ComponentScan({"com.lt.*"})
@EnableAutoConfiguration
@Configuration
@Import({ AdminConfig.class, StudentConfig.class, ProfessorConfig.class, UserConfig.class })
public class LtCrsG5SpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LtCrsG5SpringCoreApplication.class, args);
		
		System.out.println("Welcome to Spring Boot");
		
		ApplicationContext app = SpringApplication.run(AdminConfig.class);
		AdminService obj =  (AdminService) app.getBean("adminBean");
		
	}

}

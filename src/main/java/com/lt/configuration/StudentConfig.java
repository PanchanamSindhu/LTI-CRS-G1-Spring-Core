/**
 * 
 */
package com.lt.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lt.service.StudentService;
import com.lt.service.impl.StudentServiceImpl;

/**
 * @author user211
 *
 */
@Configuration
public class StudentConfig {
	@Bean(name = "studentBean")
	public StudentService adminService() {
		return new StudentServiceImpl();
	}

}

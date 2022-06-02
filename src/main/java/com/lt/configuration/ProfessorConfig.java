/**
 * 
 */
package com.lt.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lt.service.ProfessorService;
import com.lt.service.impl.ProfessorServiceImpl;

/**
 * @author user211
 *
 */
@Configuration
public class ProfessorConfig {
	@Bean(name = "professorBean")
	public ProfessorService professor() {
		return new ProfessorServiceImpl();
	}

}

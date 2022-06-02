/**
 * 
 */
package com.lt.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lt.service.AdminService;
import com.lt.service.impl.AdminServiceImpl;

/**
 * @author user211
 *
 */
@Configuration
public class AdminConfig {
	@Bean(name = "adminBean")
	public AdminService admin() {
		return new AdminServiceImpl();
	}

}

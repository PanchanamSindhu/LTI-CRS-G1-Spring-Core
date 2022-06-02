/**
 * 
 */
package com.lt.configuration;

import org.springframework.context.annotation.Bean;

import com.lt.service.LoginService;
import com.lt.service.impl.LoginServiceImpl;


/**
 * @author user211
 *
 */
public class LoginConfig {
	@Bean(name = "loginBean")
	public LoginService login() {
		return new LoginServiceImpl();
	}



}

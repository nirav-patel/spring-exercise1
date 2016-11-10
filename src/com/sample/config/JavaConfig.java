package com.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sample.service.ICustomerService;
import com.sample.service.impl.CustomerServiceImpl;

/**
 * 
 *  Annotate class with appropriate annotations to:
 * 	 1. Enable configuration
 * 	 2. Scan packages and create beans
 * 
 *  Also create beans of using java configuration
 *   
 */
@Configuration
@ComponentScan(basePackages = { "com.sample.repository", "com.sample.service" })
public class JavaConfig {

	@Bean(name = "customerService")
	@Scope("prototype")
	public ICustomerService getCustomerService() {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		return customerService;
	}
}

package com.sample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AutoConfig.class)
public class JavaConfig {

	@Autowired
	AutoConfig autoConfig;

	/**
	 * Here, create bean of CustomerServiceImpl class using java configuration method
	 * */

}

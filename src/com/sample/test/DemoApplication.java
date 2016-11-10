package com.sample.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sample.config.JavaConfig;
import com.sample.service.ICustomerService;

public class DemoApplication {

	public static void main(String[] args) {
		/**
		 * This demo application has two possible profiles:
		 * 1. Ora
		 * 2. SS
		 */

		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.register(JavaConfig.class);
		appContext.refresh();

		ICustomerService service = appContext.getBean(ICustomerService.class);
		service.displayInfo();

		((ConfigurableApplicationContext) appContext).close();
	}

}

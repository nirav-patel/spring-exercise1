package com.sample.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

import com.sample.config.JavaConfig;
import com.sample.service.ICustomerService;

public class DemoApplication {

	public static void main(String[] args) {
		/**
		 * This demo application has two possible profiles:
		 * 1. Ora
		 * 2. SS
		 */

		System.setProperty(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME, "Ora");

		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.getEnvironment().setActiveProfiles("SS");
		appContext.register(JavaConfig.class);
		appContext.refresh();

		ICustomerService service = appContext.getBean(ICustomerService.class);

		System.out.println("\n Test for current profile::");

		service.displayInfo();

		ICustomerService service2 = appContext.getBean(ICustomerService.class);
		System.out.println("\n Test for bean scope::");
		System.out.println(service);
		System.out.println(service2);
		
	    System.out.println("\n");
		((ConfigurableApplicationContext) appContext).close();
	}

}

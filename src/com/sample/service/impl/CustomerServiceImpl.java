package com.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.sample.repository.ICustomerRepository;
import com.sample.service.ICustomerService;
import com.sample.service.IManager;

/**
 * Inject appropriate dependencies for customerRepository and manager references below. 
 * 
 * Try different injection methods.
 *  1. constructor injection
 *  2. setter injection
 *  3. auto wire 
 *  
 *  Note: Try injecting different beans of IManager based on different profiles and qualifiers.
 *  Possible Qualifiers: Dev, QA, Prod
 *  
 * */
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepository customerRepository;

	@Autowired
	@Qualifier("QA")
	private IManager manager;

	public CustomerServiceImpl() {
	}

	public CustomerServiceImpl(ICustomerRepository customerRepository) {
		System.out.println("Using constructor injection");
		this.customerRepository = customerRepository;
	}

	public void setCustomerRepository(ICustomerRepository customerRepository) {
		System.out.println("Using setter injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public void displayInfo() {
		System.out.println(
				" Customers [" + customerRepository.getAllCustomers() + "] are managed by " + manager.getManagerInfo());
	}

}

package com.sample.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.sample.model.Customer;
import com.sample.repository.ICustomerRepository;

/**
 * Annotate this class to indicate it is an auto scan component
 * If required, then register bean only for specific profile or qualifier 
 * */
@Component("customerRepository")
@Profile("SS")
public class SqlServerCustomerRepositoryImpl implements ICustomerRepository {

	@Override
	public List<Customer> getAllCustomers() {

		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstname("SQLServer");
		customer.setLastname("User1");
		customers.add(customer);

		customer = new Customer();
		customer.setFirstname("SQLServer");
		customer.setLastname("User2");
		customers.add(customer);

		return customers;

	}

}

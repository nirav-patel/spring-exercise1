package com.sample.repository;

import com.sample.model.Customer;

import java.util.List;

public interface ICustomerRepository {
	List<Customer> getAllCustomers();
}

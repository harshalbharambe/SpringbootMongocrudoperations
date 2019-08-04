package com.assignment.springboot.mongo.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.assignment.springboot.mongo.model.Customer;

public interface CustomerService {

	public void createCustomer(List<Customer> customers);

	public Collection<Customer> getAllCustomers();

	public Optional<Customer> findCustomerById(int id);

	public void deleteCustomerById(int id);

	public void updateCustomer(Customer customer);

	public void deleteAllCustomers();
}
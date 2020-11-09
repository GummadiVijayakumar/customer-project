package com.tcs.springboot.customerdemo.service;

import java.util.List;

import com.tcs.springboot.customerdemo.entity.Customer;


public interface CustomerService {
	
	public List<Customer> findAll();

	public Customer findById(int theId);
	
	public void save(Customer theEmployee);
	
	public void deleteById(int theId);
	

}

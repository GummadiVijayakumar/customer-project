package com.tcs.springboot.customerdemo.service;

import java.util.List;

import com.tcs.springboot.customerdemo.entity.Customer;


public interface CustomerService {
	
	 List<Customer> findAll();

	 Customer findById(int theId);
	
	 void save(Customer theEmployee);
	
	 void deleteById(int theId);
	

}

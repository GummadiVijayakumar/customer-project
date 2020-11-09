package com.tcs.springboot.customerdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.springboot.customerdemo.dao.CustomerRepository;
import com.tcs.springboot.customerdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository CustomerRepository;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository theCustomerRepository) {
		CustomerRepository = theCustomerRepository;
	}
	
	@Override
	public List<Customer> findAll() {
		return CustomerRepository.findAll();
	}

	@Override
	public Customer findById(int theId) {
		Optional<Customer> result = CustomerRepository.findById(theId);
		
		Customer theCustomer = null;
		
		if (result.isPresent()) {
			theCustomer = result.get();
		}
		else {

			throw new RuntimeException("Did not find Customer id - " + theId);
		}
		
		return theCustomer;
	}

	@Override
	public void save(Customer theCustomer) {
		CustomerRepository.save(theCustomer);
	}

	@Override
	public void deleteById(int theId) {
		CustomerRepository.deleteById(theId);
	}


	
}

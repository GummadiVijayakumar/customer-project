package com.tcs.springboot.customerdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.springboot.customerdemo.entity.Customer;
import com.tcs.springboot.customerdemo.service.CustomerService;


@RestController
@RequestMapping("/api")
public class CustomerRestController {
	


	private CustomerService customerService;
	
	@Autowired
	public CustomerRestController(CustomerService theCustomerService) {
		customerService = theCustomerService;
	}
	

	@GetMapping("/customers")
	public List<Customer> findAll() {
		return customerService.findAll();
	}

	
}

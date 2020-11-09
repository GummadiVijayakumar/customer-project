package com.tcs.springboot.customerdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.springboot.customerdemo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}

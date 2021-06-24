package com.SG.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SG.ecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	Customer findByEmail(String theEmail);
}
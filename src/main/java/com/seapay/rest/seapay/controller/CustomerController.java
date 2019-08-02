package com.seapay.rest.seapay.controller;

import com.seapay.rest.seapay.domain.Customer;
import com.seapay.rest.seapay.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public Page<Customer> all(Pageable pageable){
        return customerRepository.findAll(pageable);
    }
}

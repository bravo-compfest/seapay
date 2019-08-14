package com.seapay.rest.seapay;

import com.seapay.rest.seapay.domain.Customer;
import com.seapay.rest.seapay.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DBInit implements CommandLineRunner {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        Customer mathias = new Customer("Mathias", "math123","123456","asdkamlsda","1234",2);
        customerRepository.save(mathias);
    }
}

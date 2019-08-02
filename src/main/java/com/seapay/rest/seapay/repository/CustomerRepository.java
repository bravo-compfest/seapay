package com.seapay.rest.seapay.repository;

import com.seapay.rest.seapay.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}

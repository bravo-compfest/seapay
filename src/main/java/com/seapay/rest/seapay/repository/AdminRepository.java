package com.seapay.rest.seapay.repository;

import com.seapay.rest.seapay.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}

package com.seapay.rest.seapay.repository;

import com.seapay.rest.seapay.domain.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant, Integer> {
}

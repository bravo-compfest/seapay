package com.seapay.rest.seapay.repository;

import com.seapay.rest.seapay.domain.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Integer> {
}

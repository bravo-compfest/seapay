package com.seapay.rest.seapay.controller;

import com.seapay.rest.seapay.domain.Wallet;
import com.seapay.rest.seapay.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
public class WalletController {

    @Autowired
    private WalletRepository walletRepository;

    @GetMapping(value = "/wallets")
    public Page<Wallet> all(Pageable pageable){
        return walletRepository.findAll(pageable);
    }


}

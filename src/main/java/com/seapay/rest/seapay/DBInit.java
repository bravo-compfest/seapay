package com.seapay.rest.seapay;

import com.seapay.rest.seapay.builder.CustomerBuilder;
import com.seapay.rest.seapay.domain.Customer;
import com.seapay.rest.seapay.domain.Wallet;
import com.seapay.rest.seapay.repository.CustomerRepository;
import com.seapay.rest.seapay.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;

public class DBInit implements CommandLineRunner {
    @Autowired
    WalletRepository walletRepository;

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public void run(String... args) throws Exception {
        Wallet walletMathias = new Wallet();
        walletMathias.addBalance(BigDecimal.ONE);
        try {
            walletMathias.reduceBalance(BigDecimal.TEN);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        Wallet walletErma = new Wallet();
        walletErma.addBalance(BigDecimal.TEN);
        walletErma.reduceBalance(BigDecimal.ONE);

        walletRepository.save(walletMathias);
        walletRepository.save(walletErma);

        Customer mathias = new CustomerBuilder().setName("mathias").setUsername("mantapgan").setPassword("123456").setWallet(walletMathias).createCustomer();
        Customer erma = new CustomerBuilder().setWallet(walletErma).createCustomer();

        mathias.setUsername("mathias");

        mathias.topUp(BigDecimal.valueOf(15));
        mathias.transfer(BigDecimal.valueOf(10));

        customerRepository.save(mathias);
        customerRepository.save(erma);




    }

}
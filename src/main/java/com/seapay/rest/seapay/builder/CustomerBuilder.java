package com.seapay.rest.seapay.builder;

import com.seapay.rest.seapay.domain.Customer;
import com.seapay.rest.seapay.domain.Wallet;

public class CustomerBuilder {
    private String name;
    private String username;
    private String password = "123456";
    private Wallet wallet;

    public CustomerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public CustomerBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public CustomerBuilder setWallet(Wallet wallet) {
        this.wallet = wallet;
        return this;
    }

    public Customer createCustomer() {
        return new Customer(name, username, password, wallet);
    }
}
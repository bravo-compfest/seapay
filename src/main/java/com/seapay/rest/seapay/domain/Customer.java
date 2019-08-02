package com.seapay.rest.seapay.domain;

import com.seapay.rest.seapay.builder.CustomerBuilder;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "CUSTOMER")
@Entity
public class Customer extends User implements Serializable {
    @Column(name = "LOYALTYLEVEL")
    private int loyaltyLevel = 0;

    public Customer(String name, String username, String password, Wallet wallet) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.wallet = wallet;
    }

    public void topUp(BigDecimal amount) {
        wallet.addBalance(amount);
        System.out.println("topUp called");
    }

    public void transfer(BigDecimal amount) {
        System.out.println("transfer called");
    }

    @Override
    public String toString() {
        return String.format("%s \n loyaltyLevel : %d", super.toString(), loyaltyLevel);
    }


}

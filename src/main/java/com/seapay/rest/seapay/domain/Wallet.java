package com.seapay.rest.seapay.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Table()
@Entity
public class Wallet implements Serializable {

    @Id
    @GeneratedValue
    @Column(updatable = false)
    private Integer id;

    @Column()
    private BigDecimal balance = BigDecimal.ZERO;

    public void addBalance(BigDecimal balance) {
        this.balance = this.balance.add(balance);
        System.out.println("Balance added");
        System.out.println(this.balance);
    }

    public void reduceBalance(BigDecimal balance) {
        this.balance = this.balance.subtract(balance);
        System.out.println("Balance reduced");
        System.out.println(this.balance);
    }

    public BigDecimal getBalance() {
        return balance;
    }
}

package com.seapay.rest.seapay.domain;


import com.seapay.rest.seapay.exception.NegativeBalanceException;

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
    }

    public void reduceBalance(BigDecimal balance) throws NegativeBalanceException {
        if(this.balance.compareTo(balance) < 0){
            throw new NegativeBalanceException("Cannot reduce balance, not enough balance");
        }
        this.balance = this.balance.subtract(balance);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("id: %d \n balance: %s", id, balance.toString());
    }
}

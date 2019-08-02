package com.seapay.rest.seapay.domain;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Table()
@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue
    @Column(updatable = false)
    private Integer id;

    @Column()
    private String name;

    @Column()
    private String username;

    @Column()
    private String password;

    @OneToOne()
    @JoinColumn(name = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Wallet wallet;

    public Customer() {
        System.out.println("Customer created");
    }

    public Customer(Wallet wallet) {
        this.wallet = wallet;
        System.out.println("Customer created");
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //    @Column()
//    @Email
//    protected Email email;

    @Column()
    protected String phoneNumber;

    @Column()
    protected String authority;


    private int loyaltyLevel = 0;

    public void topUp(BigDecimal amount) {
        System.out.println("topUp called");
    }

    public void transfer(BigDecimal amount) {
        System.out.println("transfer called");
    }


    @Override
    public String toString() {
        return String.format("id: %d \n name: %s \n username: %s \n password: %s \n loyaltyLevel : %d", id, name, username, password, loyaltyLevel);

    }


}

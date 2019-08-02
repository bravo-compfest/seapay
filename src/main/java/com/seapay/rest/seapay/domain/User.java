package com.seapay.rest.seapay.domain;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@MappedSuperclass
public abstract class User {
    @Id
    @GeneratedValue
    @Column(name = "ID", updatable = false)
    protected Integer id;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "USERNAME")
    protected String username;

    @Column(name = "PASSWORD")
    protected String password;

    @OneToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    protected Wallet wallet;

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString(){
        return String.format("id: %d \n name: %s \n username: %s \n password: %s \n loyaltyLevel : %d", id, name, username, password);
    }

}

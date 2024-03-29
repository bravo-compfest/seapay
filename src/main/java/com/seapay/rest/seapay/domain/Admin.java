package com.seapay.rest.seapay.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table
@Entity
public class Admin implements Serializable {
    @Id
    @GeneratedValue
    @Column(updatable = false)
    private Integer id;

    @Column
    private String name;

    @Column
    private String username;

    @Column
    private String password;

    public Admin() {

    }

    public Admin(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}

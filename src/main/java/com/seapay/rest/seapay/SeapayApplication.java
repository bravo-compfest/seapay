package com.seapay.rest.seapay;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SeapayApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeapayApplication.class, args);
    }

    @Bean
    public CommandLineRunner DBInit() {
        return new DBInit();
    }
}

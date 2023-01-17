package com.emanuel.cab;

import com.emanuel.cab.customer.Customer;
import com.emanuel.cab.repositories.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CabApplication {

//    @Autowired
//    private DataRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(CabApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        repository.save(new Customer("Emanuel", "Botea", "emanuel@yahoo.com", "07432543654", "emi", "emi123"));
//    }
}


package com.emanuel.cab.controller;

import com.emanuel.cab.customer.Customer;
import com.emanuel.cab.repositories.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping(path = "/")
public class DataController {

    @Autowired
    private DataRepository customerRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addUser(@RequestParam String firstName, @RequestParam String lastName
            , @RequestParam String email, @RequestParam String phoneNumber, @RequestParam String userName
            , @RequestParam String password) {
        Customer customer = new Customer();

        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setPhoneNumber(phoneNumber);
        customer.setUserName(userName);
        customer.setPassword(password);
        customerRepository.save(customer);

        return "New customer saved with success!";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}

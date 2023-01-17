package com.emanuel.cab.repositories;


import com.emanuel.cab.customer.Customer;
import org.springframework.data.repository.CrudRepository;

public interface DataRepository extends CrudRepository<Customer, Integer> {
}

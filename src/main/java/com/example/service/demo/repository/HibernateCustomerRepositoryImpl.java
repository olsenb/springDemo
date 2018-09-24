package com.example.service.demo.repository;

import com.example.service.demo.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository{

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFistname("John");
        customer.setLastname("Smith");

        customers.add(customer);

        return customers;
    }
}

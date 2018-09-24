package com.example.service.demo.repository;

import com.example.service.demo.model.Customer;

import java.util.List;

public interface CustomerRepository {

    public List<Customer> findAll();
}

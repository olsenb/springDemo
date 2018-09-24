package com.example.service.demo.service;

import com.example.service.demo.model.Customer;
import com.example.service.demo.repository.CustomerRepository;
import com.example.service.demo.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }



}

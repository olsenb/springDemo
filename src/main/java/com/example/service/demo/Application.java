package com.example.service.demo;

import com.example.service.demo.service.CustomerService;
import com.example.service.demo.service.CustomerServiceImpl;

public class Application {

    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findAll().get(0).getFistname());
    }
}

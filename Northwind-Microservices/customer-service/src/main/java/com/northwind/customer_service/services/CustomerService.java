package com.northwind.customer_service.services;

import com.northwind.customer_service.model.entities.Customer;
import com.northwind.customer_service.repositories.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }
}

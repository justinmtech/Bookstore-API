package com.justinmtech.book_store_api.services;

import com.justinmtech.book_store_api.entities.Customer;
import com.justinmtech.book_store_api.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customers;

    public Optional<Customer> getCustomer(String email) {
        return customers.findById(email);
    }

    public void deleteCustomer(String email) {
        customers.deleteById(email);
    }

    public Customer saveCustomer(Customer customer) {
        return customers.save(customer);
    }

    public List<Customer> getCustomers() {
        return (List<Customer>) customers.findAll();
    }
}

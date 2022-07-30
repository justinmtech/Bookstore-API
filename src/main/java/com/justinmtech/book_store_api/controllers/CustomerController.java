package com.justinmtech.book_store_api.controllers;

import com.justinmtech.book_store_api.entities.Customer;
import com.justinmtech.book_store_api.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping("/getCustomers")
    public List<Customer> getCustomers() {
        return service.getCustomers();
    }

    @GetMapping("/getCustomer/{email}")
    public ResponseEntity<Customer> getCustomer(@PathVariable(value = "email") String email) {
        Optional<Customer> customer = service.getCustomer(email);
        if (customer.isPresent()) {
            return ResponseEntity.ok(customer.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/saveCustomer")
    public Customer saveCustomer(@Validated @RequestBody Customer customer) {
        return service.saveCustomer(customer);
    }

    @GetMapping("/deleteCustomer/{email}")
    public void removeCustomer(@PathVariable(value = "email") String email) {
        service.deleteCustomer(email);
    }
}

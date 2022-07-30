package com.justinmtech.bookstore_api.repositories;

import com.justinmtech.bookstore_api.entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {
}

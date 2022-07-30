package com.justinmtech.bookstore_api.repositories;

import com.justinmtech.bookstore_api.entities.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}

package com.justinmtech.bookstore_api.services;

import com.justinmtech.bookstore_api.entities.Order;
import com.justinmtech.bookstore_api.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@Service
public class OrderService {

    @Autowired
    OrderRepository orders;

    public Optional<Order> getOrder(Long id) {
        return orders.findById(id);
    }

    public void deleteOrder(Long id) {
        orders.deleteById(id);
    }

    public Order saveOrder(Order order) {
        return orders.save(order);
    }

    public List<Order> getOrders() {
        return (List<Order>) orders.findAll();
    }
}

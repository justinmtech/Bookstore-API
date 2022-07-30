package com.justinmtech.bookstore_api.controllers;

import com.justinmtech.bookstore_api.entities.Order;
import com.justinmtech.bookstore_api.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SuppressWarnings({"OptionalIsPresent", "unused"})
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    OrderService orders;

    @GetMapping("/getOrders")
    public List<Order> getOrders() {
        return orders.getOrders();
    }

    @GetMapping("/getOrder/{id}")
    public ResponseEntity<Order> getOrder(Long id) {
        Optional<Order> order = orders.getOrder(id);
        if (order.isPresent()) {
            return ResponseEntity.ok(order.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/deleteOrder/{id}")
    public void deleteOrder(@PathVariable(value = "id") Long id) {
        orders.deleteOrder(id);
    }

    @PostMapping("/saveOrder")
    public Order saveOrder(@Validated @RequestBody Order order) {
        return orders.saveOrder(order);
    }
}

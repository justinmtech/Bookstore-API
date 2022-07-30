package com.justinmtech.book_store_api.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@SuppressWarnings("ALL")
@Entity
@Table(name = "book_store_customer")
public class Customer {
    @Id
    @Column(name = "id", nullable = false)
    private String id;
    @OneToMany
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private List<Order> orders;
    private Date joinDate;

    @PrePersist
    public void onCreate() {
        joinDate = new Date();
        setId(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
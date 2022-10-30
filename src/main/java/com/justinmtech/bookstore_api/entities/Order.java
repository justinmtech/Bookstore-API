package com.justinmtech.bookstore_api.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings("unused")
@Entity
@Table(name = "book_store_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;
    @ManyToMany
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private List<Book> books;
    @Column(name = "date")
    private Date date;

    @PrePersist
    protected void onCreate() {
        date = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getBooks() {
        List<Long> bookIds = new ArrayList<>();
        for (Book b : books) {
            bookIds.add(b.getId());
        }
        return bookIds;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomer() {
        return customer.getId();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
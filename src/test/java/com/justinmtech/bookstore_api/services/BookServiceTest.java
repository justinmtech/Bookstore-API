package com.justinmtech.bookstore_api.services;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookServiceTest {

    @Autowired
    BookService bookService;

    @BeforeAll
    public void setup() {
    }

    @Test
    void getBook() {
        bookService.getBook(1L);
    }

    @Test
    void deleteBook() {
    }

    @Test
    void saveBook() {
    }

    @Test
    void getBooks() {
    }
}
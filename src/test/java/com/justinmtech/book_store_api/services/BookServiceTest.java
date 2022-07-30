package com.justinmtech.book_store_api.services;

import com.justinmtech.book_store_api.entities.Book;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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
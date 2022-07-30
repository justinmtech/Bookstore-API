package com.justinmtech.book_store_api.controllers;

import com.justinmtech.book_store_api.entities.Book;
import com.justinmtech.book_store_api.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/getBooks")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/getBook/{id}")
    public ResponseEntity<Book> getBook(@PathVariable(value = "id") Long id) {
        Optional<Book> book = bookService.getBook(id);
        if (book.isPresent()) {
            return ResponseEntity.ok(book.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/saveBook")
    public Book saveBook(@Validated @RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping("/deleteBook/{id}")
    public void deleteBook(@PathVariable(value = "id") Long id) {
        bookService.deleteBook(id);
    }
}

package com.justinmtech.book_store_api.services;

import com.justinmtech.book_store_api.entities.Book;
import com.justinmtech.book_store_api.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@Service
public class BookService {

    @Autowired
    BookRepository books;

    public Optional<Book> getBook(Long id) {
        return books.findById(id);
    }

    public void deleteBook(Long id) {
        books.deleteById(id);
    }

    public Book saveBook(Book book) {
        return books.save(book);
    }

    public List<Book> getBooks() {
        return (List<Book>) books.findAll();
    }
}

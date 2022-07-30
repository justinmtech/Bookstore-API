package com.justinmtech.book_store_api;

import com.justinmtech.book_store_api.services.BookService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookStoreApiApplicationTests {

	@Autowired
	BookService bookService;

	@Test
	void contextLoads() {
		Assertions.assertThat(bookService).isNotNull();
	}

}

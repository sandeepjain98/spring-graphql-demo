package com.example.DemoGraphQL.controller;

import com.example.DemoGraphQL.service.BookService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    BookService bookService;

    public AuthorController(BookService bookService) {
        this.bookService = bookService;
    }


}

package com.example.clientservice.controllers;

import com.example.clientservice.feign.BookFeign;
import com.example.clientservice.models.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class BookController {
    private BookFeign bookFeign;

    public BookController(BookFeign bookFeign) {
        this.bookFeign = bookFeign;
    }

    @GetMapping("/books")
    List<Book> getAllBooksFromClient() {
        return bookFeign.getAllBooks();
    }
}

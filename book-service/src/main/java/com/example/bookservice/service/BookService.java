package com.example.bookservice.service;

import com.example.bookservice.models.Book;
import com.example.bookservice.repository.BookRepository;

public interface BookService {
    Iterable<Book> findAll();
}

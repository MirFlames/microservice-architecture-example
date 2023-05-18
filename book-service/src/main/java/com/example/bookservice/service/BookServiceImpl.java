package com.example.bookservice.service;

import com.example.bookservice.models.Book;
import com.example.bookservice.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}

package com.example.bookservice.repository;

import com.example.bookservice.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BaseRepository<T> extends CrudRepository<T, Long> {
}

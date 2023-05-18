package com.example.bookservice.repository;

import com.example.bookservice.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends BaseRepository<Book> {
}

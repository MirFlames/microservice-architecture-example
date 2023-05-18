package com.example.clientservice.feign;

import com.example.clientservice.models.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("book-service")
public interface BookFeign {
    @GetMapping("/api/books")
    List<Book> getAllBooks();
}

package com.vishal.bookstoreapi.controller;

import com.vishal.bookstoreapi.model.Book;
import com.vishal.bookstoreapi.model.BookEntity;
import com.vishal.bookstoreapi.repository.BookRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class Controller
{
    private final BookRepo bookRepo;

    public Controller(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

//    @PostMapping("bookstore/add")
//    public ResponseEntity<?> AddEmp(@RequestBody BookEntity book)
//    {
//        BookEntity save = this.bookRepo.save(book);
//        return ResponseEntity.ok(save);
//    }

    @PostMapping("bookstore/add")
    public String AddEmp(@RequestBody Book book)
    {
        BookEntity b1 = BookEntity.builder().build();
        this.bookRepo.save(b1);
        return "Added Book with ID: " + book.getID() + book.getName();
    }

    @GetMapping("bookstore/get")
    public ResponseEntity<?> GetEmp()
    {
        return ResponseEntity.ok(this.bookRepo.findAll());
    }

    @GetMapping("bookstore/get_with_id/{id}")
    public Optional<BookEntity> GetWithID(@PathVariable int id)
    {
        return bookRepo.findById(id);
    }

    @DeleteMapping("bookstore/delete/{id}")
    public String Delete(@PathVariable int id)
    {
        bookRepo.deleteById(id);
        return "Deleted with ID: " + String.valueOf(id);
    }

//    @PostMapping("bookstore/add")
//    public String AddEmp(@RequestBody Book book)
//    {
//        bookRepo.save(book);
//        return "Added Book with ID: " + book.getName();
//    }
//
//    @GetMapping("bookstore/get")
//    public List<Book> GetEmp()
//    {
//        return bookRepo.findAll();
//    }
}
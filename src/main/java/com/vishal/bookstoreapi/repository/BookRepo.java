package com.vishal.bookstoreapi.repository;

import com.vishal.bookstoreapi.model.BookEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends MongoRepository<BookEntity, Integer> {
}
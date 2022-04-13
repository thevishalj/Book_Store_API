package com.vishal.bookstoreapi.mapper;

import com.vishal.bookstoreapi.model.Book;
import com.vishal.bookstoreapi.model.BookEntity;

public class Mapper
{
    Book book;
    BookEntity bookEntity = BookEntity.builder().ID(book.getID())
            .Name(book.getName()).Genre(book.getGenre()).Year(book.getYear()).build();
}
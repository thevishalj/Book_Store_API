package com.vishal.bookstoreapi.model;

import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Document(collection= "Books")
public class BookEntity
{
    private int ID;
    private String Name;
    private String Genre;
    private int Year;
}
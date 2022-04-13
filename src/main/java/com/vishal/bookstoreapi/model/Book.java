package com.vishal.bookstoreapi.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Book
{
//    @Id                                               //to automatically generate IDs
    private int ID;
    private String Name;
    private String Genre;
    private int Year;
}
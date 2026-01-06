package com.example.swagger_ui_api;

public class Book {
    private String title;
    private String author;

    // Constructors
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters and Setters
    public String getTitle() { return title; } //It will display the book title that is added
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}



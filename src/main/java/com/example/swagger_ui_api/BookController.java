package com.example.swagger_ui_api;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private List<Book> library = new ArrayList<>();

    // 1. GET Request: See all books
    @GetMapping
    public List<Book> getBooks() {
        return library;
    }

    // 2. POST Request: Add a new book
    @PostMapping
    public String addBook(@RequestBody Book book) {
        library.add(book);
        return "Book added: " + book.getTitle();
    }
}

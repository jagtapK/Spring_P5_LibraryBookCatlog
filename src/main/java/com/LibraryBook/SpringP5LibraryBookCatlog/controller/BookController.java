package com.LibraryBook.SpringP5LibraryBookCatlog.controller;

import com.LibraryBook.SpringP5LibraryBookCatlog.entity.Book;
import com.LibraryBook.SpringP5LibraryBookCatlog.repository.BookRepository;
import com.LibraryBook.SpringP5LibraryBookCatlog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/saveBook")
    public ResponseEntity<String> addBooks(@RequestBody List<Book> book){
        book.forEach(Book1->{
            System.err.println(Book1);
            bookService.saveBook(Book1);
        });
        return new ResponseEntity<>("Book details saved",HttpStatus.CREATED);
    }
}

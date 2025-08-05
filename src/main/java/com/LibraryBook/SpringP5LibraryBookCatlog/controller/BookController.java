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

    //This method created to add book details in database

    @PostMapping("/saveBook")
    public ResponseEntity<String> addBooks(@RequestBody List<Book> book) {
        book.forEach(Book1 -> {
            System.err.println(Book1);
            bookService.saveBook(Book1);
        });
        return new ResponseEntity<>("Book details saved", HttpStatus.CREATED);
    }

    //This Method created to get all Book Details on postman

    @GetMapping("/getAllBook")
    public ResponseEntity<List<Book>> getALlBook() {
        List<Book> bookList = bookService.getAllBooks();
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }

    //This Method created to get Books By their id

    @GetMapping("/GetById/{id}")
    public ResponseEntity<Book> getById(@PathVariable int id) {
        Book book = bookService.getBookById(id);
        if (book != null) {
            return ResponseEntity.ok(book);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/deleteById/{id}")
    public ResponseEntity<String> deleteById(int id){
        String book = bookService.deleteById(id);
        return new ResponseEntity<>(book,HttpStatus.OK);
    }
}

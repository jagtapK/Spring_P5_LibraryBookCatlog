package com.LibraryBook.SpringP5LibraryBookCatlog.service;

import com.LibraryBook.SpringP5LibraryBookCatlog.entity.Book;

import java.util.List;

public interface BookService {

    //to save/add books in database
    public String saveBook(Book book);

    //to get all books in postman
    public List<Book> getAllBooks();

    //to get books by their Id
    public Book getBookById(int id);

    public String deleteById(int id);
}

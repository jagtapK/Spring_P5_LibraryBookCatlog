package com.LibraryBook.SpringP5LibraryBookCatlog.service;

import com.LibraryBook.SpringP5LibraryBookCatlog.entity.Book;

import java.util.List;

public interface BookService {

    public String saveBook(Book book);

    public List<Book> getAllBooks();
}

package com.LibraryBook.SpringP5LibraryBookCatlog.serviceImpl;

import com.LibraryBook.SpringP5LibraryBookCatlog.entity.Book;
import com.LibraryBook.SpringP5LibraryBookCatlog.repository.BookRepository;
import com.LibraryBook.SpringP5LibraryBookCatlog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public String saveBook(Book book) {
        Book book1 = bookRepository.save(book);
        return "Book Data Saved";
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> getAllBook = bookRepository.findAll();
        return getAllBook;
    }

    @Override
    public Book getBookById(int id) {
        Book BookById = bookRepository.findById(id).orElseThrow(() ->
                new NullPointerException("Id not found" + id));
        return BookById;
    }
}

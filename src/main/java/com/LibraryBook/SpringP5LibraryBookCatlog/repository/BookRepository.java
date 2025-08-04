package com.LibraryBook.SpringP5LibraryBookCatlog.repository;

import com.LibraryBook.SpringP5LibraryBookCatlog.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}

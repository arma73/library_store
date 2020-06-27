package com.librarystore.library.dao;

import com.librarystore.library.domain.Book;

import java.util.List;

public interface BookDao {
    List<Book> getAll();
    Book get(long id);
    Book save(Book obj);
    void delete(Book object);
}

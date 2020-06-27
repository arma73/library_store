package com.librarystore.library.dao;

import com.librarystore.library.domain.Author;

import java.util.List;

public interface AuthorDao {
    List<Author> getAll();
    Author get(long id);
    Author save(Author obj);
    void delete(Author object);
}

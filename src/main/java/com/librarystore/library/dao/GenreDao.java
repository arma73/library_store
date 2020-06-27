package com.librarystore.library.dao;

import com.librarystore.library.domain.Genre;

import java.util.List;

public interface GenreDao {
    List<Genre> getAll();
    Genre get(long id);
    Genre save(Genre obj);
    void delete(Genre object);
}

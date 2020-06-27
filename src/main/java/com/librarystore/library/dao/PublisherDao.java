package com.librarystore.library.dao;

import com.librarystore.library.domain.Publisher;

import java.util.List;

public interface PublisherDao {
    List<Publisher> getAll();
    Publisher get(long id);
    Publisher save(Publisher obj);
    void delete(Publisher object);
}

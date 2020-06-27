package com.librarystore.library.dao;

import java.util.List;

/**
 * @param <E> the type of element for access data
 * @see AuthorDao
 * @see BookDao
 * @see GenreDao
 * @see PublisherDao
 */
public interface GeneralDao<E> {
    List<E> getAll();
    E get(long id);
    E save(E entity);
    void delete(E entity);

    List<E> search(String ... searchString);
}

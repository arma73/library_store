package com.librarystore.library.dao;

import com.librarystore.library.domain.Book;

import java.util.List;

/**
 *  Describes specific behavior for working with books.
 */
public interface BookDao extends GeneralDao<Book> {
    /**
     * Search for Top Books
     * @param limit maximum number of books
     */
    List<Book> findTopBooks(int limit);
    /**
     * Search for Top Books
     * @param begin starting point
     * @param limit maximum number of books from the starting point
     */
    List<Book> findTopBooks(int begin, int limit);
}

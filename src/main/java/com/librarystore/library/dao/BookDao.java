package com.librarystore.library.dao;

import com.librarystore.library.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 *  Describes specific behavior for working with books.
 */
public interface BookDao extends GeneralDao<Book> {
    /**
     * Search for Top Books.
     * @param limit maximum number of books.
     */
    List<Book> findTopBooks(int limit);
    /**
     * Search for Top Books.
     * @param begin starting point.
     * @param limit maximum number of books from the starting point.
     */
    List<Book> findTopBooks(int begin, int limit);

    /**
     * Receiving content.
     * @param id get content by id.
     */
    byte[] getContent(long id);

    /**
     * Page output of books of a certain genre.
     * @param pageNumber what page will search.
     * @param pageSize how many elements should be in the page.
     * @param sortField a set of results using one or more columns in ascending or descending order.
     * @param sortDirection the list of sorting directions.
     * @param genreId primary key for genre.
     */
    Page<Book> findByGenre(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection, long genreId);

    /**
     * Book view statistics update.
     * @param viewCount number of new views.
     * @param id of the book that should update.
     */
    void updateViewCount(long viewCount, long id);

    /**
     * Update Rating data.
     * @param totalRating final rating of all calculations.
     * @param totalVoteCount how many times voted for the book.
     * @param avgRating average rating.
     * @param id book.
     */
    void updateRating(long totalRating, long totalVoteCount, int avgRating, long id);
}

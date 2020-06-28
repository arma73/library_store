package com.librarystore.library.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

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

    /**
     * Getting all records with sorting the result
     */
    List<E> getAll(Sort sort);

    /**
     * Getting all records with pagination.
     * @param pageNumber what page will search.
     * @param pageSize how many elements should be in the page.
     * @param sortField a set of results using one or more columns in ascending or descending order.
     * @param sortDirection the list of sorting directions.
     */
    Page<E> getAll(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection);

    E get(long id);

    E save(E entity);

    void delete(E entity);

    /**
     * Search for records.
     * @param searchString any number of parameters.
     */
    List<E> search(String... searchString);

    /**
     * Search for records with pagination.
     * @param pageNumber what page will search.
     * @param pageSize how many elements should be in the page.
     * @param sortField a set of results using one or more columns in ascending or descending order.
     * @param sortDirection the list of sorting directions.
     * @param searchString what should be the search.
     */
    Page<E> search(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection, String... searchString);
}

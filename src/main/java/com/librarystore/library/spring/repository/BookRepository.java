package com.librarystore.library.spring.repository;

import com.librarystore.library.domain.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
* Note: When receiving book lists - the content for each book is empty.
*/
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    /**
     * Search for books by title or author.
     * @param name book.
     * @param fio author book.
     */
    List<Book> findByNameContainingIgnoreCaseOrAuthorFioContainingIgnoreCaseOrderByName(String name, String fio);

    /**
     * Get the list of books page by page.
     * @param pageable parameters for page. Implement with {@link org.springframework.data.domain.PageRequest}.
     */
    @Query(value = "select new com.librarystore.library.domain.Book(" +
            "b.id, b.name, b.pageCount, b.isbn, b.genre, b.author, b.publisher, " +
            "b.publishYear, b.image, b.descr, b.viewCount, b.totalRating, b.totalVoteCount, b.avgRating) from Book b")
    Page<Book> findAllWithoutContent(Pageable pageable);

    @Modifying(clearAutomatically = true)
    @Query(value = "update Book b set b.content=:content where b.id=:id")
    void updateContent(@Param("content") byte[] content, @Param("id") long id);

    @Query(value = "select new com.librarystore.library.domain.Book(b.id, b.image) from Book b")
    List<Book> findTopBooks(Pageable pageable);

    @Query(value = "select new com.librarystore.library.domain.Book(b.id, b.name, b.pageCount, b.isbn, " +
            "b.genre, b.author, b.publisher, b.publishYear, b.image, b.descr, b.viewCount, " +
            "b.totalRating, b.totalVoteCount, b.avgRating) from Book b where b.genre.id=:genreId")
    Page<Book> findByGenre(@Param("genreId") long genreId, Pageable pageable);

    @Query(value = "select b.content FROM Book b where b.id = :id")
    byte[] getContent(@Param("id") long id);
}

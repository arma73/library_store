package com.librarystore.library.spring.repository;

import com.librarystore.library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* Note: When receiving book lists - the content for each book is empty.
*/
@Repository
public interface BookRepository extends JpaRepository<Book, Long> { }

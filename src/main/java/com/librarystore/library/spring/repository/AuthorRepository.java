package com.librarystore.library.spring.repository;

import com.librarystore.library.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    /**
     * Hibernate request will be built based on the method name
     * @param fio name sent from client
     */
    List<Author> findByContainingIgnoreCaseOrderByFio(String fio);
}

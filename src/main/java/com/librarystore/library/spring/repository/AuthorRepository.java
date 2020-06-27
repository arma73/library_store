package com.librarystore.library.spring.repository;

import com.librarystore.library.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    /**
     * @param fio name sent from client
     */
    List<Author> findByFioContainingIgnoreCaseOrderByFio(String fio);
}

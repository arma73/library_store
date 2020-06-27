package com.librarystore.library.spring.repository;

import com.librarystore.library.domain.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    /**
     * @param fio name sent from client
     */
    List<Author> findByFioContainingIgnoreCaseOrderByFio(String fio);

    /**
     * Get the list of authors page by page
     * @param fio name sent from client
     * @param pageable parameters for page. Implement with {@link org.springframework.data.domain.PageRequest}
     */
    Page<Author> findByFioContainingIgnoreCaseOrderByFio(String fio, Pageable pageable);
}

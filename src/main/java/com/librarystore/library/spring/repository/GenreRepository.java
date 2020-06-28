package com.librarystore.library.spring.repository;

import com.librarystore.library.domain.Genre;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
    List<Genre> findByNameContainingIgnoreCaseOrderByName(String name);

    /**
     * Get the list of genres page by page
     * @param pageable parameters for page. Implement with {@link org.springframework.data.domain.PageRequest}
     */
    Page<Genre> findByNameContainingIgnoreCaseOrderByName(String name, Pageable pageable);
}

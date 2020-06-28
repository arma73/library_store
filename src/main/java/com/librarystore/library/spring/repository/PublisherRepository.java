package com.librarystore.library.spring.repository;

import com.librarystore.library.domain.Publisher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    List<Publisher> findByNameContainingIgnoreCaseOrderByName(String name);

    /**
     * Get the list of publishers page by page
     * @param pageable parameters for page. Implement with {@link org.springframework.data.domain.PageRequest}
     */
    Page<Publisher> findByNameContainingIgnoreCaseOrderByName(String name, Pageable pageable);
}

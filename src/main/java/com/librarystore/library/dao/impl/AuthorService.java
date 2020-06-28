package com.librarystore.library.dao.impl;

import com.librarystore.library.dao.AuthorDao;
import com.librarystore.library.domain.Author;
import com.librarystore.library.spring.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AuthorService implements AuthorDao {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @Override
    public List<Author> getAll(Sort sort) {
        return authorRepository.findAll(sort);
    }

    @Override
    public Page<Author> getAll(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection) {
        return authorRepository.findAll(PageRequest.of(pageNumber, pageSize, Sort.by(sortDirection, sortField)));
    }

    @Override
    public Author get(long id) {
        Optional<Author> bookmark = authorRepository.findById(id);
        return bookmark.orElse(null);
    }

    @Override
    public Author save(Author entity) {
        return authorRepository.save(entity);
    }

    @Override
    public void delete(Author entity) {
        authorRepository.delete(entity);
    }

    @Override
    public List<Author> search(String... searchString) {
        return authorRepository.findByFioContainingIgnoreCaseOrderByFio(searchString[0]);
    }

    @Override
    public Page<Author> search(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection, String... searchString) {
        return authorRepository.findByFioContainingIgnoreCaseOrderByFio(
                searchString[0], PageRequest.of(pageNumber, pageSize, Sort.by(sortDirection, sortField))
        );
    }
}

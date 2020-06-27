package com.librarystore.library.spring.controller;

import com.librarystore.library.domain.Author;
import com.librarystore.library.spring.repository.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import lombok.extern.java.Log;

import java.util.List;

@Controller
@Log
public class RedirectController {
    private AuthorRepository authorRepository;

    @GetMapping
    public String baseUrlRedirect() {
        List<Author> authorList = getAuthorRepository().findAll();
        return "index";
    }

    public AuthorRepository getAuthorRepository() {
        return authorRepository;
    }

    @Autowired
    public void setAuthorRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
}

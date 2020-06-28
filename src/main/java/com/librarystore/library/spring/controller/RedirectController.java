package com.librarystore.library.spring.controller;

import com.librarystore.library.domain.Author;
import com.librarystore.library.spring.repository.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import lombok.extern.java.Log;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@Log
public class RedirectController {
    @GetMapping
    public String baseUrlRedirect(HttpServletRequest request, HttpServletResponse response) {
        return "redirect:" + request.getRequestURL().append("index.xhtml").toString();
    }
}

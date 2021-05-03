package com.library.library.controller;

import com.library.library.model.Librarian;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibrarianController {

    @GetMapping("/")
    public Librarian getInfo() {
        Librarian librarian= new Librarian();
        return librarian;
    }
}

package com.library.library.controller;

import com.library.library.model.Librarian;
import com.library.library.service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

@RestController
@RequestMapping("/api/librarian")
public class LibrarianController {
    @Autowired
    private LibrarianService service;

    @GetMapping("/getall")
    public List<Librarian> getAllInfos() {
        return service.findAll();
    }

    @GetMapping("/get/{name}")
    public Librarian getLibrarian(@PathVariable String name, HttpServletRequest request, HttpServletResponse response) {

        Librarian data = service.findByName(name);
        // System.out.println(data);
        return data;

    }

    @PostMapping("/create")
    public Librarian saveLibrarian(@RequestBody Librarian librarian) {
        return this.service.create(librarian);
    }

    @PutMapping("/update")
    public Librarian updateLibrarian(@RequestBody Librarian librarian) {
        return this.service.update(librarian);
    }
}

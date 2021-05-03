package com.library.library.controller;

import com.library.library.model.Librarian;
import com.library.library.service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Librarian getLibrarian(@PathVariable String name) {
        System.out.println(name);
        return service.findByName(name);
    }

    @PostMapping("/create")
    public Librarian saveLibrarian(@RequestBody Librarian librarian) {
        return this.service.create(librarian);
    }

    @PutMapping("/update")
    public Librarian updateLibrarian(@RequestBody Librarian librarian) {
        return this.service.create(librarian);
    }
}

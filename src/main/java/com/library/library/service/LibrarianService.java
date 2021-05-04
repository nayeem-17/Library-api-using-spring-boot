package com.library.library.service;

import com.library.library.model.Librarian;
import com.library.library.repository.LibrarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrarianService {
    @Autowired
    LibrarianRepository repository;

    public List<Librarian> findAll() {
        return repository.findAll();
    }

    public Librarian update(Librarian librarian) {
        Librarian prevData = repository.findById(librarian.getUserId()).get();
        librarian.setCreatedAt(prevData.getCreatedAt());
        Librarian updatedData = repository.save(librarian);
        return updatedData;
    }

    public Librarian create(Librarian librarian) {
        return repository.save(librarian);
    }

    public Librarian findByName(String id) {
        return repository.findByName(id);
    }
}

package com.library.library.repository;

import com.library.library.model.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, String> {
    Librarian findByName(String name);
}

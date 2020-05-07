package com.jamesmhare.boxofficemanager.repository;

import com.jamesmhare.boxofficemanager.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByName(String name);
    Book findByIdAndName(Long id, String name);

}
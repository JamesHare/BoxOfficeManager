package com.jamesmhare.boxofficemanager.service;

import com.jamesmhare.boxofficemanager.model.Book;
import com.jamesmhare.boxofficemanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list() {
        return bookRepository.findAll();
    }

    public List<Book> findAllById(Iterable<Long> iterable) {
        return bookRepository.findAllById(iterable);
    }

    public Book findByName(String name) {
        return bookRepository.findByName(name);
    }

    public Book findByIdAndName(Long id, String name) {
        return bookRepository.findByIdAndName(id, name);
    }
}
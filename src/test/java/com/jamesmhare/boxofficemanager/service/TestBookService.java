package com.jamesmhare.boxofficemanager.service;

import com.jamesmhare.boxofficemanager.model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBookService {

    @Autowired
    private BookService bookService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
    List<Book> books = bookService.list();
    assertEquals(books.size(), 3);
    }

    @Test
    public void whenApplicationStarts_thenCanFindBookById() {
        List<Long> ids = new ArrayList<>();
        ids.add(2L);
        List<Book> books = bookService.findAllById(ids);
        assertEquals(books.size(), 1);
        Book theBook = books.get(0);
        assertEquals("Poem Strip", theBook.getName());
    }

    @Test
    public void whenApplicationStarts_thenCanFindBookByName() {
        Book book = bookService.findByName("Poem Strip");
        assertEquals("Poem Strip", book.getName());
    }

    @Test
    public void whenApplicationStarts_thenCanFindBookByIdAndName() {
        Book book = bookService.findByIdAndName(4L, "Poem Strip");
        assertEquals("Poem Strip", book.getName());
        assertEquals(4L, book.getId());
        assertNotEquals(2L, book.getId());
    }

}
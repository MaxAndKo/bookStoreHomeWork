package com.konchalov.bookmarket;

import com.konchalov.bookmarket.entity.Author;
import com.konchalov.bookmarket.entity.Book;
import com.konchalov.bookmarket.repository.AuthorRepository;
import com.konchalov.bookmarket.repository.BookRepository;
import com.konchalov.bookmarket.service.AuthorSpecification;
import com.konchalov.bookmarket.service.SearchCriteria;
import com.konchalov.bookmarket.service.Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookMarketApplicationTests {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;
    
    @Autowired
    private Service service;

    @Test
    void contextLoads() {
    }

    @Test
    @Transactional
    void bookShouldReturnAllBooks(){
        List<Book> books = bookRepository.findAll();
        assertFalse(books.stream().anyMatch(b -> b.getName().isBlank()));
        assertFalse(books.stream().anyMatch(b -> b.getCost() == 0));
        assertFalse(books.stream().anyMatch(b -> b.getAuthors().isEmpty()));
        assertEquals(books.size(), 8);
    }

    @Test
    @Transactional
    void authorShouldReturnAllAuthors(){
        List<Author> authors = authorRepository.findAll();
        assertFalse(authors.stream().anyMatch(b -> b.getName().isBlank()));
        assertFalse(authors.stream().anyMatch(b -> b.getBooks().isEmpty()));
        assertEquals(authors.size(), 9);
    }

    @Test
    @Transactional
    void authorShouldReturnAllBooksByAuthor(){
        Author author = authorRepository.findById(1L).orElse(null);

        assertNotNull(author);

        List<Book> books = author.getBooks();

        assertNotNull(books);
        assertFalse(books.stream().anyMatch(b -> b.getName().isBlank()));
        assertTrue(books.stream().allMatch(b -> b.getAuthors().stream().anyMatch(a -> a.getName().equals(author.getName()))));
        assertEquals(books.size(), 2);
    }

    @Test
    @Transactional
    void bookShouldReturnBook(){
        Book book = bookRepository.findById(1L).orElse(null);

        assertNotNull(book);

        assertEquals(book.getId(), 1);
        assertEquals(book.getName(), "Nightcrawling");
        assertEquals(book.getCost(), 500);
        assertNotNull(book.getAuthors());
    }

    @Test
    @Transactional
    void bookShouldReturnAllBooksCostByAuthor(){
        Author author = authorRepository.findById(3L).get();

        double cost = bookRepository.getCostAllBooksByAuthor(author);

        assertEquals(cost, 900);
    }

    @Test
    @Transactional
    void test(){
        List<Author> authors = authorRepository.findAll(
                new AuthorSpecification(new SearchCriteria("name", "", "James Patterson")));
        System.out.println(authors.size());
    }


}

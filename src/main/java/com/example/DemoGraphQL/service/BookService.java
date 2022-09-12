package com.example.DemoGraphQL.service;

import com.example.DemoGraphQL.model.Book;
import com.example.DemoGraphQL.model.BookArtist;
import com.example.DemoGraphQL.repository.BookArtistsRepository;
import com.example.DemoGraphQL.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class BookService {

    BookRepository bookRepository;
    BookArtistsRepository bookArtistsRepository;

    BookService(BookRepository bookRepository,
                BookArtistsRepository bookArtistsRepository) {
        this.bookRepository = bookRepository;
        this.bookArtistsRepository = bookArtistsRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBook(Long id) {
        return bookRepository.findById(id).orElseGet(null);
    }

    public Book save(
            String title,
            String isbn,
            Integer pageCount,
            List<Long> authorList,
            Long id
    ) {
        Book book = bookRepository.save(new Book(title, isbn, pageCount, id));
        authorList.forEach(i -> {
            bookArtistsRepository.save(new BookArtist(new Random().nextLong(), id, i));
        });
        return book;
    }
}

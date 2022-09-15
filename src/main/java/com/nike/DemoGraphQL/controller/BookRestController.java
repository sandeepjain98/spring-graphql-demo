package com.nike.DemoGraphQL.controller;

import com.nike.DemoGraphQL.exception.BookNotFoundException;
import com.nike.DemoGraphQL.model.Book;
import com.nike.DemoGraphQL.repository.AuthorRepository;
import com.nike.DemoGraphQL.repository.BookArtistsRepository;
import com.nike.DemoGraphQL.repository.BookRepository;
import com.nike.DemoGraphQL.service.AuthorService;
import com.nike.DemoGraphQL.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookRestController {
    BookService bookService;
    BookRepository bookRepository;
    AuthorRepository authorRepository;
    AuthorService authorService;
    BookArtistsRepository bookArtistsRepository;

    public BookRestController(BookService bookService,
                              BookRepository bookRepository,
                              AuthorRepository authorRepository,
                              AuthorService authorService,
                              BookArtistsRepository bookArtistsRepository) {
        this.bookService = bookService;
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.authorService = authorService;
        this.bookArtistsRepository = bookArtistsRepository;

    }

    @GetMapping(path = "/books")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping(path = "/books/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book getAllBooks(@PathVariable Long id) {
        return bookService.getBook(id);
    }

    @GetMapping(path = "/books/{id}/authors/{auid}")
    @ResponseStatus(HttpStatus.OK)
    public Book getAllBooks(@PathVariable Long id, @PathVariable Long auid) {
        return bookService.getBook(id);
    }

    @QueryMapping
    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @QueryMapping
    public long countBooks() {
        return bookRepository.count();
    }

    @MutationMapping
    public Book updateBookPageCount(@Argument Integer pageCount, @Argument Long id) {
        Optional<Book> opt = bookRepository.findById(id);
        if (opt.isPresent()) {
            Book book = opt.get();
            book.setPageCount(pageCount);
            bookRepository.save(book);
            return book;
        }
        throw new BookNotFoundException("The book to be updated was not found", id);
    }

    @MutationMapping
    public Book newBook(@Argument String title,
                        @Argument String isbn,
                        @Argument Integer pageCount,
                        @Argument List<Long> authorList,
                        @Argument Long id) {

        return bookService.save(title, isbn, pageCount, authorList, id);

    }

}

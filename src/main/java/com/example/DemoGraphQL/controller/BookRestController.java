package com.example.DemoGraphQL.controller;

import com.example.DemoGraphQL.exception.BookNotFoundException;
import com.example.DemoGraphQL.model.Author;
import com.example.DemoGraphQL.model.Book;
import com.example.DemoGraphQL.model.BookArtist;
import com.example.DemoGraphQL.repository.AuthorRepository;
import com.example.DemoGraphQL.repository.BookArtistsRepository;
import com.example.DemoGraphQL.repository.BookRepository;
import com.example.DemoGraphQL.service.AuthorService;
import com.example.DemoGraphQL.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
public class BookRestController {
BookService bookService;
BookRepository bookRepository;
AuthorRepository authorRepository;
AuthorService authorService;
BookArtistsRepository bookArtistsRepository;
    public BookRestController(BookService bookService,
                              BookRepository bookRepository ,
                              AuthorRepository authorRepository,
                              AuthorService authorService,
                              BookArtistsRepository bookArtistsRepository) {
        this.bookService = bookService;
        this.bookRepository=bookRepository;
        this.authorRepository=authorRepository;
        this.authorService=authorService;
        this.bookArtistsRepository=bookArtistsRepository;

    }

    @GetMapping(path = "/books")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAllBooks()
         {
         return bookService.getAllBooks();
    }

    @GetMapping(path = "/books/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book getAllBooks(@PathVariable Long id)
    {
        return bookService.getBook(id);
    }

    @GetMapping(path = "/books/{id}/authors/{auid}")
    @ResponseStatus(HttpStatus.OK)
    public Book getAllBooks(@PathVariable Long id, @PathVariable Long auid)
    {
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
    @QueryMapping
    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAuthors();
    }
    @QueryMapping
    public long countAuthors() {
        return authorRepository.count();
    }
    @QueryMapping
    public List<Author> findAuthorByBookId( @Argument Long bookId ) {
        return authorService.getAuthorByBookId(bookId);
    }

    @SchemaMapping
    public List<Author> authorList(Book book) {
        return authorService.getAuthorByBookId(book.getId());
    }

    @MutationMapping
    public Book updateBookPageCount(@Argument Integer pageCount,  @Argument  Long id) {
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
    public Author newAuthor( @Argument String firstName,
                             @Argument String lastName,
                             @Argument Long id)
    {
        return authorRepository.save(new Author(firstName,lastName,id));
    }

    @MutationMapping
    public Book newBook( @Argument String title,
                             @Argument String isbn,
                             @Argument Integer pageCount,
                            @Argument  List<Long> authorList ,
                            @Argument  Long id)
    {

    Book  book=   bookRepository.save(new Book(title,isbn,pageCount,id));
         authorList.forEach(i -> {
             System.out.println("Auth ID:" + i);
             bookArtistsRepository.save(new BookArtist(new Random().nextLong(),id, i));
         });
         return book;

    }

}

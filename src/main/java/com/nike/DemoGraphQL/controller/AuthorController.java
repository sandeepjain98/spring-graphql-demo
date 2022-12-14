package com.nike.DemoGraphQL.controller;

import com.nike.DemoGraphQL.model.Author;
import com.nike.DemoGraphQL.model.Book;
import com.nike.DemoGraphQL.repository.AuthorRepository;
import com.nike.DemoGraphQL.service.AuthorService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    AuthorRepository authorRepository;
    AuthorService authorService;

    public AuthorController( AuthorRepository authorRepository,
                            AuthorService authorService) {
        this.authorService = authorService;
        this.authorRepository=authorRepository;
    }
    @QueryMapping
    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAuthors();
    }

    @QueryMapping
    public long countAuthors() {
        return authorService.count();
    }

    @QueryMapping
    public List<Author> findAuthorByBookId(@Argument Long bookId) {
        return authorService.getAuthorByBookId(bookId);
    }

    @SchemaMapping
    public List<Author> authorList(Book book) {
        return authorService.getAuthorByBookId(book.getId());
    }

    @MutationMapping
    public Author newAuthor(@Argument String firstName,
                            @Argument String lastName,
                            @Argument Long id) {
        return authorRepository.save(new Author(firstName, lastName, id));
    }

}

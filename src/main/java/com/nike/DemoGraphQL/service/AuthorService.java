package com.nike.DemoGraphQL.service;

import com.nike.DemoGraphQL.model.Author;
import com.nike.DemoGraphQL.model.BookArtist;
import com.nike.DemoGraphQL.repository.AuthorRepository;
import com.nike.DemoGraphQL.repository.BookArtistsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuthorService {
    BookArtistsRepository bookArtistsRepository;
    AuthorRepository authorRepository;

    public AuthorService(BookArtistsRepository bookArtistsRepository, AuthorRepository authorRepository) {
        this.bookArtistsRepository = bookArtistsRepository;
        this.authorRepository = authorRepository;
    }

    public List<Author> getAuthorByBookId(Long bookId) {
        List<BookArtist> bookArtistList = bookArtistsRepository.findAuthorIdByBookId(bookId);
        return authorRepository.findAllById(bookArtistList.stream().map(c -> c.getArtistsId()).distinct().collect(Collectors.toList()));
    }

    public long count() {
      return  authorRepository.count();
    }
}

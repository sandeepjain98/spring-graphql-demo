package com.nike.DemoGraphQL.repository;

import com.nike.DemoGraphQL.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Query(
            value = "SELECT * FROM AUTHOR AUTHOR",
            nativeQuery = true)
    Collection<Author> findAuthors();
}

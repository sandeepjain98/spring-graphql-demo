package com.nike.DemoGraphQL.repository;

import com.nike.DemoGraphQL.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}

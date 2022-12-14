package com.nike.DemoGraphQL.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

@Entity
public class Book {
    @Id
    @Column(name = "book_id", nullable = false)
    private Long id;

    @Column(name = "book_title", nullable = false)
    private String title;

    @Column(name = "book_isbn", nullable = false)
    private String isbn;

    @Column(name = "book_pageCount", nullable = false)
    private int pageCount;
    @Transient
    private List<Author> authorList;

    public Book() {
    }

    public Book(String title, String isbn, int pageCount, Long id) {
        this.title = title;
        this.isbn = isbn;
        this.pageCount = pageCount;
        this.id = id;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Transient
    private Price price;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id.equals(book.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}

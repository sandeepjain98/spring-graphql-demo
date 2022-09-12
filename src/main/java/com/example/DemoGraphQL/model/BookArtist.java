package com.example.DemoGraphQL.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookArtist {
    @Id
    Long id;
    @Column(name = "book_id", nullable = false)
    Long bookId;
    @Column(name = "artists_id", nullable = false)
    Long artistsId;

    public BookArtist(Long id, Long bookId, Long artistsId) {
        this.id = id;
        this.bookId = bookId;
        this.artistsId = artistsId;
    }

    public BookArtist() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getArtistsId() {
        return artistsId;
    }

    public void setArtistsId(Long artistsId) {
        this.artistsId = artistsId;
    }

}


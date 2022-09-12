package com.example.DemoGraphQL.model;

import javax.persistence.*;

@Entity
public class BookArtist {
        public BookArtist(Long id, Long bookId, Long artistsId) {
                this.id = id;
                this.bookId = bookId;
                this.artistsId = artistsId;
        }

        @Id
        Long id;

        public BookArtist() {

        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        @Column(name="book_id", nullable = false)
        Long bookId;

        @Column(name="artists_id", nullable = false)
        Long artistsId;

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


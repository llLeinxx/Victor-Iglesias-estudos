package com.Atividade.Atividade.dto;

import com.Atividade.Atividade.domain.Book;

import java.io.Serializable;

public class BookDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String book;
    private String author;
    private int published;
    private String gender;

    public BookDTO(){}

    public BookDTO(Book obj){
        id = obj.getId();
        book = obj.getBook();
        author = obj.getAuthor();
        published = obj.getPublished();
        gender = obj.getGender();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

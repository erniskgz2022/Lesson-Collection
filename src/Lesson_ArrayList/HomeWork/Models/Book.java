package Lesson_ArrayList.HomeWork.Models;

import Lesson_ArrayList.HomeWork.Enums.Genre;
import Lesson_ArrayList.HomeWork.db.BGenerateID;

public class Book {
       private Long id;
       private String name;
       private String author;
       private Genre genre;

    public Book() {
    }

    public Book( String name, String author, Genre genre) {
        this.id = BGenerateID.genBookId();
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "\n~~~~~~~~~Book~~~~~~~" + "\n" +
                "Book ID: " + id + "\n" +
                "Name: " + name + '\n' +
                "Author: " + author + '\n' +
                "Genre: " + genre + "\n";
    }
}

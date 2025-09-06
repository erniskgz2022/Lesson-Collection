package Lesson_ArrayList.HomeWork.Models;

import Lesson_ArrayList.HomeWork.db.BGenerateID;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
   private Long id;
   private String name;
   private String address;
   private List<Book> books = new ArrayList<>();
   private List<Reader> readers = new ArrayList<>();

    public Library() {
    }

    public Library( String name, String address) {
        this.id = BGenerateID.genLibraryId();
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    @Override
    public String toString() {
        return "\n~~~~~~~~~~Library~~~~~~~~~~~~" + "\n" +
                "Lbl ID:" + id + "\n" +
                "Name: " + name + '\n' +
                "Address: " + address + '\n' +
                books + "\n" +
                readers + "\n";
    }
}

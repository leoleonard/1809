package com.example.library.model;

public class Book {
   private String title;
   private String author;
   private int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void showInfo() {
        System.out.println(title + " " +  author + " "+ isbn);
    }

//    public String showInfo() {
//        return title + " " +  author + " "+ isbn;
//    }
}

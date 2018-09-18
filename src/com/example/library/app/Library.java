package com.example.library.app;
import com.example.library.model.Book;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Tower", "Stephen", 122);

        book1.setAuthor("King");

        book1.showInfo();
    }
}

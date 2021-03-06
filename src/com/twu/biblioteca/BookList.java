package com.twu.biblioteca;
import java.util.HashMap;
import java.util.Map;

public class BookList {
    private Map<String, Book> books;

    public BookList() {
        books = new HashMap<String, Book>();
    }

    public int size() {
        return books.size();
    }

    public Map<String, Book> getBooks() {
        return books;
    }

    public Book getBookByTitle(String title) {
        return books.get(title);
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void removeBook(String title) {
        books.remove(title);
    }

}

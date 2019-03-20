package com.company;

import java.util.Date;

public class Books {

    private Book[] books;

    public Books(int lenght) {

        books = new Book[lenght];
    }
    public Books() {}

    public void addBook(Book book) {
        for(int i = 0; i < books.length; i++) {
                books[i] = book;
        }
    }
    public void printBooks() {
        for(Book b : books) {
            b.review();
        }
    }

    public Book[] findDateBooks (Date date) {
        Book[] dateBooks = new Book[books.length];
        int i = 0;

        for(Book b : books) {
            if (b.getBookReleaseYear().getTime() > date.getTime()) {
                dateBooks[i++] = b;
            }
        }
        return dateBooks;
    }

    public Book[] findAuthorBooks(String author) {
        Book[] targetBooks = new Book[books.length];
        int i = 0;

        for(Book b : books) {
            if (b.getBookAuthor().equals(author)) {
                targetBooks[i++] = b;
            }
        }
        return targetBooks;
    }

    public void changeBookPrice(boolean flag, double prcnt) {
        if (flag) {
            for (Book book : books) {
                book.setBookPrice((book.getBookPrice() * prcnt / 100) + book.getBookPrice());
            }
        }
        else {
            for (Book book : books) {
                book.setBookPrice(book.getBookPrice() - (book.getBookPrice() * prcnt / 100));
            }
        }
    }
}

package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {

    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookPublishHouse;
    private Date bookReleaseYear;
    private int bookPageQuant;
    private double bookPrice;
    private SimpleDateFormat format = new SimpleDateFormat("yyyy");

    public Book(int bookId,String bookName,String bookAuthor,String bookPublishHouse,Date bookReleaseYear,
                int bookPageQuant,double bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublishHouse = bookPublishHouse;
        this.bookReleaseYear = bookReleaseYear;
        this.bookPageQuant = bookPageQuant;
        this.bookPrice = bookPrice;
    }
    public Book() {}

    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublishHouse() {
        return bookPublishHouse;
    }
    public void setBookPublishHouse(String bookPublishHouse) {
        this.bookPublishHouse = bookPublishHouse;
    }

    public Date getBookReleaseYear() {
        return bookReleaseYear;
    }
    public void setBookReleaseYear (Date bookReleaseYear) {
        this.bookReleaseYear = bookReleaseYear;
    }

    public int getBookPageQuant() {
        return bookPageQuant;
    }
    public void setBookPageQuant(int bookPageQuant) {
        this.bookPageQuant = bookPageQuant;
    }

    public double getBookPrice() {
        return bookPrice;
    }
    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void review() {

        System.out.println(this.getBookId());
        System.out.println(this.getBookName());
        System.out.println(this.getBookAuthor());
        System.out.println(this.getBookPublishHouse());
        System.out.println(this.getBookId());
        System.out.println(format.format(this.getBookReleaseYear()));
        System.out.println(this.getBookPageQuant());
        System.out.println(getBookPrice());

    }
}

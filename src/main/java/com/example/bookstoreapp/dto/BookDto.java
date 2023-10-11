package com.example.bookstoreappp.dto;

public class BookDto {
    private String bookName;
    private String author;



    private String bookDescription;
    private String bookImg;
    private int price;
    private int quantity;

//    public BookDto() {
//    }

    public BookDto(String bookName, String author, String bookDescription, String bookImg, int price, int quantity) {
        this.bookName = bookName;
        this.author = author;
        this.bookDescription = bookDescription;
        this.bookImg = bookImg;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", bookImg='" + bookImg + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

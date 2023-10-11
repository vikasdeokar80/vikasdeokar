package com.example.bookstoreappp.dto;

public class CartDto {
    private int userId;
    private int bookId;
    private int quantity;

//    public CartDto() {
//    }

    public CartDto(int userId, int bookId, int quantity) {
        this.userId = userId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartDto{" +
                "userId=" + userId +
                ", bookId=" + bookId +
                ", quantity=" + quantity +
                '}';
    }
}

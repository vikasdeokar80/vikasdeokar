package com.example.bookstoreappp.dto;
import com.example.bookstoreappp.model.User;

import java.sql.Date;
public class OrderDto {
    private int userId;

    private int bookId;
    private Date date;

    private int totalPrice;

    private int quantity;

    private String address;

    boolean cancel;

    public OrderDto(int userId, int bookId, Date date, int totalPrice, int quantity, String address, boolean cancel) {
        this.userId = userId;
        this.bookId = bookId;
        this.date = date;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
        this.address = address;
        this.cancel = cancel;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

//    public OrderDto() {
//    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "userId=" + userId +
                ", bookId=" + bookId +
                ", date=" + date +
                ", totalPrice=" + totalPrice +
                ", quantity=" + quantity +
                ", address='" + address + '\'' +
                ", cancel=" + cancel +
                '}';
    }
}

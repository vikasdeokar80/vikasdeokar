package com.example.bookstoreappp.model;
import com.example.bookstoreappp.dto.OrderDto;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class OrderData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long orderId;
    private int userId;
    private int bookId;
    private Date date;
    private int totalPrice;
    private int quantity;
    private String address;

    boolean cancel;

    public OrderData(Long orderId, int userId, int bookId, Date date, int totalPrice, int quantity, String address, boolean cancel) {
        this.orderId = orderId;
        this.userId = userId;
        this.bookId = bookId;
        this.date = date;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
        this.address = address;
        this.cancel = cancel;
    }

    public OrderData() {
    }

    public OrderData(OrderDto orderDto) {

        this.userId = orderDto.getUserId();
        this.bookId = orderDto.getBookId();
        this.date = orderDto.getDate();
        this.totalPrice = orderDto.getTotalPrice();
        this.quantity = orderDto.getQuantity();
        this.address = orderDto.getAddress();
        this.cancel = cancel;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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

    @Override
    public String toString() {
        return "OrderData{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", date=" + date +
                ", totalPrice=" + totalPrice +
                ", quantity=" + quantity +
                ", address='" + address + '\'' +
                ", cancel=" + cancel +
                '}';
    }
}

package com.example.bookstoreappp.model;
import com.example.bookstoreappp.dto.CartDto;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private int cartId;
    private int userId;
    private int bookId;
    private int quantity;

    public Cart(int cartId, int userId, int bookId, int quantity) {
        this.cartId = cartId;
        this.userId = userId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    public Cart() {
    }

    public Cart(CartDto cartDto) {
        this.cartId = cartDto.getUserId();
        this.userId = cartDto.getUserId();
        this.bookId = cartDto.getBookId();
        this.quantity = cartDto.getQuantity();
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
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
        return "Cart{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", quantity=" + quantity +
                '}';
    }
}

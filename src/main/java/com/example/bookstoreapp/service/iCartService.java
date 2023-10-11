package com.example.bookstoreappp.service;
import com.example.bookstoreappp.dto.CartDto;
import com.example.bookstoreappp.model.Cart;

import java.util.List;
import java.util.Optional;
public interface ICartService {
    public Cart insert(CartDto cartDto);
    public List<Cart> getAll();

    public Optional<Cart> getById(int id);
    public void delete(int id);

    public Cart updateById(int id, CartDto cartDto);
    public Cart updateQuantity(int id, int quantity);
}


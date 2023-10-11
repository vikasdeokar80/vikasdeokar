package com.example.bookstoreappp.service;
import com.example.bookstoreappp.dto.CartDto;
import com.example.bookstoreappp.model.Cart;
//import com.example.bookstoreappp.model.User;
import com.example.bookstoreappp.repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService  implements ICartService{
    @Autowired
    CartRepo cartRepo;

    @Override
    public Cart insert(CartDto cartDto) {
        Cart cart = new Cart(cartDto);
        return cartRepo.save(cart);
    }

    @Override
    public List<Cart> getAll() {
        return cartRepo.findAll();

    }

    @Override
    public Optional<Cart> getById(int id) {
        return cartRepo.findById(id);
    }

    @Override
    public void delete(int id) {
        cartRepo.deleteById(id);
    }

    @Override
    public Cart updateById(int id, CartDto cartDto) {
        cartRepo.findById(id);
        Cart cart = new Cart(cartDto);
        cart.setCartId(id);
        Cart cart1 = cartRepo.save(cart);
        return cart1;
    }


    @Override
    public Cart updateQuantity(int id, int quantity){
        Cart cart = cartRepo.findByCartId(id);
        cart.setQuantity(quantity);
        return cartRepo.save(cart);
    }
}


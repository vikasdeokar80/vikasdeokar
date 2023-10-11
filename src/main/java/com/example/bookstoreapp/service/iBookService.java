package com.example.bookstoreappp.service;
import com.example.bookstoreappp.dto.BookDto;
import com.example.bookstoreappp.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    public Book insert(BookDto bookDto);

    public List<Book> getAll();

    public Optional<Book> getById(int id);

    public void delete(int id);

    public Book searchByName(String name);
    public Object sortAsc();
    public Object sortDesc();

    public Object update(int id,BookDto bookDto);
    public Book updateQuantity(int id, int quantity);
}



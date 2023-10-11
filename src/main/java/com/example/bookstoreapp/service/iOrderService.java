package com.example.bookstoreappp.service;
import com.example.bookstoreappp.dto.OrderDto;
import com.example.bookstoreappp.model.OrderData;

import java.util.List;
import java.util.Optional;

public interface IOrderService {
    public OrderData insert(OrderDto orderDto);
    public List<OrderData> getAll();
    public Optional<OrderData> getById(Long id);
    public void delete(Long id);
    public OrderData updateById(Long id, OrderDto orderDto);
    public Object cancelOrder(Long orderId);
}

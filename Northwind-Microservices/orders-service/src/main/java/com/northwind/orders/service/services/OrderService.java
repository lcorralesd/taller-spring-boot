package com.northwind.orders.service.services;

import com.northwind.orders.service.model.entities.Order;
import com.northwind.orders.service.respositories.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private IOrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

}

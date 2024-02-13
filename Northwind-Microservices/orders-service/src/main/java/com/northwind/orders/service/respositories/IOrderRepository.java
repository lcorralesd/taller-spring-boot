package com.northwind.orders.service.respositories;

import com.northwind.orders.service.model.entities.Order;
import org.springframework.data.repository.ListCrudRepository;

public interface IOrderRepository extends ListCrudRepository<Order, Integer>{
}

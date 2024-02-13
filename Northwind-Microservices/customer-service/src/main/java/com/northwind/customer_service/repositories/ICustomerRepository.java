package com.northwind.customer_service.repositories;

import com.northwind.customer_service.model.entities.Customer;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

public interface ICustomerRepository extends ListCrudRepository<Customer, String> {


}

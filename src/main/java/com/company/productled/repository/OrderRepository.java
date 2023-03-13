package com.company.productled.repository;

import org.springframework.data.repository.CrudRepository;

import com.company.productled.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
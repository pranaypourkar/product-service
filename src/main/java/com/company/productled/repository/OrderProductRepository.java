package com.company.productled.repository;

import org.springframework.data.repository.CrudRepository;

import com.company.productled.model.OrderProduct;
import com.company.productled.model.OrderProductPK;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
package com.company.productled.repository;

import org.springframework.data.repository.CrudRepository;

import com.company.productled.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
package com.spring2020.coffeeshop.repository;

import com.spring2020.coffeeshop.domain.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}

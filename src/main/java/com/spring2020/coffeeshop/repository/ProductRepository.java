package com.spring2020.coffeeshop.repository;

import com.spring2020.coffeeshop.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

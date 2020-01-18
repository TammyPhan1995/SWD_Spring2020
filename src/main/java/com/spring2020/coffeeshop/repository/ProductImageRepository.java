package com.spring2020.coffeeshop.repository;

import com.spring2020.coffeeshop.domain.entity.ProductImage;
import org.springframework.data.repository.CrudRepository;

public interface ProductImageRepository extends CrudRepository<ProductImage, Long> {
}

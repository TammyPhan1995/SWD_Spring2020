package com.spring2020.coffeeshop.repository;

import com.spring2020.coffeeshop.domain.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}

package com.spring2020.coffeeshop.repository;

import com.spring2020.coffeeshop.domain.entity.OrderStatus;
import org.springframework.data.repository.CrudRepository;

public interface OrderStatusRepository extends CrudRepository<OrderStatus, Integer> {
}

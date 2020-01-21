package com.spring2020.coffeeshop.repository;

import com.spring2020.coffeeshop.domain.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Integer> {
}

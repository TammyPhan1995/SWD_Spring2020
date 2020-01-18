package com.spring2020.coffeeshop.repository;

import com.spring2020.coffeeshop.domain.entity.OrderDetail;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, Long> {
}

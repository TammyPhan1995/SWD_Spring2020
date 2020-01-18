package com.spring2020.coffeeshop.repository;

import com.spring2020.coffeeshop.domain.entity.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

public interface CustomerOrderRepository extends CrudRepository<CustomerOrder, Long> {
}

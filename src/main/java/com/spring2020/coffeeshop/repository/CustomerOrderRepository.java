package com.spring2020.coffeeshop.repository;

import com.spring2020.coffeeshop.domain.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {
}

package com.spring2020.coffeeshop.repository;

import com.spring2020.coffeeshop.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

package com.spring2020.coffeeshop.repository;

import com.spring2020.coffeeshop.domain.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}

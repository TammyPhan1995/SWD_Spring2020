package com.spring2020.coffeeshop.repository;

import com.spring2020.coffeeshop.domain.entity.Staff;
import org.springframework.data.repository.CrudRepository;

public interface StaffRepository extends CrudRepository<Staff, Long> {
}

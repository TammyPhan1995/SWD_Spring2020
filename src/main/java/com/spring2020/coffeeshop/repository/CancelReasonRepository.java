package com.spring2020.coffeeshop.repository;

import com.spring2020.coffeeshop.domain.entity.CancelReason;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CancelReasonRepository extends CrudRepository<CancelReason, Long> {
}

package com.spring2020.coffeeshop.repository;

import com.spring2020.coffeeshop.domain.entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long> {
}

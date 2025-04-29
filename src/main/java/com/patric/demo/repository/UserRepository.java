package com.patric.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patric.demo.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}

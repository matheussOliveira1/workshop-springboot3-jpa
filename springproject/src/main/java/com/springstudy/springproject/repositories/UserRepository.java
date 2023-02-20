package com.springstudy.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springstudy.springproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{}

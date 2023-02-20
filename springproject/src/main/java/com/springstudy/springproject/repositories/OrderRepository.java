package com.springstudy.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springstudy.springproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{}

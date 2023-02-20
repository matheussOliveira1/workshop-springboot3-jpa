package com.springstudy.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springstudy.springproject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{}

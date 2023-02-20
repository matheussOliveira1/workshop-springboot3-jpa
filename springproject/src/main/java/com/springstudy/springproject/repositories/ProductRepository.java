package com.springstudy.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springstudy.springproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{}

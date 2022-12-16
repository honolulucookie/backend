package com.ph.springbootecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ph.springbootecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

package com.ravindra.ravindraproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravindra.ravindraproject.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

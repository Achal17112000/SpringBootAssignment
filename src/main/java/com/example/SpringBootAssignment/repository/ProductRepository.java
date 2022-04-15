package com.example.SpringBootAssignment.repository;

import com.example.SpringBootAssignment.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    Product findByProductName(String name);
}


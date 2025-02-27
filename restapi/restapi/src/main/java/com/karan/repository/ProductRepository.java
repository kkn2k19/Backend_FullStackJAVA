package com.karan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karan.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}

package com.karan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karan.model.Product;
import com.karan.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository prepo;

    public void addProduct(Product p) {
        prepo.save(p);
    }

    public List<Product> getData() {
        return prepo.findAll();
    }
}

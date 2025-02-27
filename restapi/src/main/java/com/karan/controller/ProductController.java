package com.karan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karan.model.Product;
import com.karan.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService pservice;

    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@RequestBody Product p) {
        String msg = "Product added successfully";
        pservice.addProduct(p);
        return new ResponseEntity<String>(msg, HttpStatus.CREATED);
    }

    @GetMapping("/fetch")
    public ResponseEntity<List<Product>> getProduct() {
        List<Product> plist = pservice.getData();
        return new ResponseEntity<List<Product>>(plist, HttpStatus.OK);
    }
}

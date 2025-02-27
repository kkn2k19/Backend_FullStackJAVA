package com.karan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    // POST
    @PostMapping("/add")
    public ResponseEntity<String> addProduct(@RequestBody Product p) {
        String msg = "Product added successfully";
        pservice.addData(p);
        return new ResponseEntity<String>(msg, HttpStatus.CREATED);
    }

    // GET
    @GetMapping("/fetch")
    public ResponseEntity<List<Product>> getProduct() {
        List<Product> plist = pservice.getData();
        return new ResponseEntity<List<Product>>(plist, HttpStatus.OK);
    }

    // GET BY ID
    @GetMapping("/fetch/{pid}")
    public ResponseEntity<Product> getProductById(@PathVariable String pid) {
        Product p = pservice.getDataById(pid);
        return new ResponseEntity<Product>(p, HttpStatus.OK);
    }

    // UPDATE
    @PutMapping("/update/{pid}")
    public ResponseEntity<Product> updateProduct(@PathVariable String pid, @RequestBody Product pNew) {
        Product pOld = pservice.updateData(pid, pNew);
        return new ResponseEntity<Product>(pOld, HttpStatus.OK);
    }

    // DELETE
    @DeleteMapping("/delete/{pid}")
    public ResponseEntity<String> deleteProduct(@PathVariable String pid) {
        String msg = "Product Deleted Successfully";
        pservice.deleteData(pid);
        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }
}

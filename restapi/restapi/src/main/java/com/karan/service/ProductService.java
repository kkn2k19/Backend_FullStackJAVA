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

    // ADD DATA
    public void addData(Product p) {
        prepo.save(p);
    }

    // GET ALL DATA
    public List<Product> getData() {
        return prepo.findAll();
    }

    // GET DATA BY ID
    public Product getDataById(String pid) {
        return prepo.findById(pid).orElse(null);
    }

    // UPDATE DATA (return the updated row value)
    public Product updateData(String pid, Product pNew) {
        Product pOld = prepo.findById(pid).orElse(null);
        if (pOld != null) {
            pOld.setPname(pNew.getPname());
            pOld.setPqty(pNew.getPqty());
            pOld.setPrice(pNew.getPrice());
            prepo.save(pOld);
        }
        return pOld;
    }

    // DELETE THE DATA
    public void deleteData(String pid) {
        Product p = prepo.findById(pid).orElse(null);
        if (p != null) {
            prepo.delete(p);
        }
    }
}

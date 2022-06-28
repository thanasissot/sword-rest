package com.sot.thanasis.swordrest.service;

import com.sot.thanasis.swordrest.model.Product;
import com.sot.thanasis.swordrest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    // CREATE
    public Product createCustomer(Product product) {
        return productRepository.save(product);
    }

    // READ
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    // DELETE
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}

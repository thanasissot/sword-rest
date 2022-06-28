package com.sot.thanasis.swordrest.service;

import com.sot.thanasis.swordrest.model.ProductLine;
import com.sot.thanasis.swordrest.repository.ProductLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductLineService {
    @Autowired
    ProductLineRepository productLineRepository;

    // CREATE
    public ProductLine createProductLine(ProductLine productLine) {
        return productLineRepository.save(productLine);
    }

    // READ
    public List<ProductLine> getProductLines() {
        return productLineRepository.findAll();
    }

    // DELETE
    public void deleteProductLine(Long productLineId) {
        productLineRepository.deleteById(productLineId);
    }
}

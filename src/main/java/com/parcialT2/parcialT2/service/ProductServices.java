package com.parcialT2.parcialT2.service;

import com.parcialT2.parcialT2.models.Product;
import com.parcialT2.parcialT2.repository.productRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    @Autowired
    private productRepository productRepository;

    public Product save (Product product){
        return productRepository.save(product);
    }

    public Product getProductById(String id){
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
}

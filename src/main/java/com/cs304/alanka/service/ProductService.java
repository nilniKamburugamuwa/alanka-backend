package com.cs304.alanka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs304.alanka.model.Product;
import com.cs304.alanka.repository.ProductRepository;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public void deleteProduct(Long id){ productRepository.deleteById(id);}
    
    public Product getProductById(Long id) {
    	return productRepository.findById(id).get();
    }
    
    public Product editProduct(Product product, Long id) {
    	return productRepository.save(product);
    }
    

}












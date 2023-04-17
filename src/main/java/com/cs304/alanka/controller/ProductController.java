package com.cs304.alanka.controller;

import com.cs304.alanka.model.Product;
import com.cs304.alanka.service.ProductService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path = "api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/getAll")
    public List<Product> getAllProducts(){return productService.getAllProducts();}

    @GetMapping("/get/{id}")
    public Product getProduct(@PathVariable(name="id") Long id) {
    	return productService.getProductById(id);
    }
    
    @PostMapping("/save")
    public Product addProduct(@RequestBody Product product){return productService.addProduct(product);}
    
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable(name="id") Long id) {
    	productService.deleteProduct(id);
    }
    
    @PostMapping("/edit/{id}")
    public Product editProduct(@RequestBody Product product, @PathVariable Long id) {
    	product.setProductId(id);
    	return productService.addProduct(product);
    }

}

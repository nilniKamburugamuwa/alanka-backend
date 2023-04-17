package com.cs304.alanka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cs304.alanka.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	public Product getProductById(Long id);
}






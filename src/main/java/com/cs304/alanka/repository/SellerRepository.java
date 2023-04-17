package com.cs304.alanka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cs304.alanka.model.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

	public Seller getSellerById(Long id);
}





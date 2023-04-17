package com.cs304.alanka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cs304.alanka.model.Buyer;

public interface BuyerRepository extends JpaRepository<Buyer, Long>{

	public Buyer getBuyerById(Long id);
}

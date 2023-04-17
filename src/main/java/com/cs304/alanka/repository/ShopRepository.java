package com.cs304.alanka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cs304.alanka.model.Shop;

public interface ShopRepository extends JpaRepository<Shop, Long>{

	public Shop getShopById(Long id);
}




package com.cs304.alanka.model;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name="shops")
public class Shop{

	@Id
	@Column
	private Long id;
	
	@Column
	private String name;
	
	@Column
	@OneToMany(mappedBy="shop")
	private Set<Product> products;


	public Shop() {}


	public Shop(Long shopId, String name, Set<Product> products) {
		super();
		this.id = shopId;
		this.name = name;
		this.products = products;
	}


	public Long getShopId() {
		return id;
	}


	public void setShopId(Long shopId) {
		this.id = shopId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<Product> getProducts() {
		return products;
	}


	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
	
}







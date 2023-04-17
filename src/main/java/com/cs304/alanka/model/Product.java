package com.cs304.alanka.model;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Product{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private float price;
	
	@Column
	private int rating;
	
	@Column
	private int stock;

	@Column
	private String category;
	
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	private String image;
	
	
	@ManyToOne
	@JoinColumn(name="shopId")
	private Shop shop;
	
	public Product() {}

	public Product(Long productId, String name, String description, float price, int rating, int stock, String category, String image,
			Shop shop) {
		super();
		this.id = productId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.rating = rating;
		this.stock = stock;
		this.category = category;
		this.image = image;
		this.shop = shop;
	}

	public Long getProductId() {
		return id;
	}

	public void setProductId(Long productId) {
		this.id = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Shop getShop() {
		return shop;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
	
	
	
}






package com.cs304.alanka.model;

import jakarta.persistence.*;

@Entity
@Table(name="requests")
public class Request{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private float budget;
	
	@Column
	private int quantity;

	@Column
	private String category;
	
	@Column
	private String image;
	
	@Column
	private String dueDate;

	public Request() {}
	public Request(Long id, String title, String description, float budget, int quantity, String category, String image,
			String dueDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.budget = budget;
		this.quantity = quantity;
		this.category = category;
		this.image = image;
		this.dueDate = dueDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getBudget() {
		return budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	
}






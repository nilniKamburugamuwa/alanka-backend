package com.cs304.alanka.model;

import jakarta.persistence.*;

@Entity
@Table(name="blogs")
public class Blog {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column
	private String title;
	
	@Column
	private String content;
	
	@Column
	private String image;

	public Blog() {}
	
	public Blog(Long blogId, String title, String content, String image) {
		super();
		this.id = blogId;
		this.title = title;
		this.content = content;
		this.image = image;
	}

	public Long getBlogId() {
		return id;
	}

	public void setBlogId(Long blogId) {
		this.id = blogId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
	
	
}

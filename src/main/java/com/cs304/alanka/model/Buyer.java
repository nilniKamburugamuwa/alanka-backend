package com.cs304.alanka.model;

import jakarta.persistence.*;

@Entity
@Table(name="buyers")
public class Buyer extends User{

	@Column
	private Long buyerId;
	
	@Column
	private String address;
	
	@Column
	private String country;
	
	@Column
	private String zipcode;
	
	@Column
	private String phoneNumber;

	public Buyer() {}
	
	public Buyer(Long buyerId, String address, String country, String zipcode, String phoneNumber) {
		super();
		this.buyerId = buyerId;
		this.address = address;
		this.country = country;
		this.zipcode = zipcode;
		this.phoneNumber = phoneNumber;
	}

	public Long getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Long buyerId) {
		this.buyerId = buyerId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}

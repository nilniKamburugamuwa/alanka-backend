package com.cs304.alanka.model;

import jakarta.persistence.*;

@Entity
@Table(name="sellers")
public class Seller extends User{

	@Column
	private Long sellerId;
	
	@Column 
	private String nic;
	
	@Column
	private String address;
	
	@Column
	private String zipcode;
	
	@Column
	private String phoneNumber;

	public Seller() {}

	public Seller(Long sellerId, String nic, String address, String zipcode, String phoneNumber) {
		super();
		this.sellerId = sellerId;
		this.nic = nic;
		this.address = address;
		this.zipcode = zipcode;
		this.phoneNumber = phoneNumber;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
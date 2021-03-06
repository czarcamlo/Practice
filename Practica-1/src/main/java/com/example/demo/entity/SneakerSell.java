package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.sneakertype.SneakerType;

@Entity
@Table (name = "Sneaker")
public class SneakerSell {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column (name = "CUSTOMER_NAME", nullable = false)
	private String customerName; 
	
	@Column (name = "CUSTOMER_LASTNAME", nullable = false)
	private String customerLastName;
	
	@Column (name = "PHONE", nullable = false)
	private String phone;
	
	@Column (name = "EMAIL", nullable = false)
	private String email;
	
	@Column (name = "SNEAKER_TYPE", nullable = false)
	private SneakerType sneaker;
	
	@Column (name = "PRICE", nullable = false)
	private int price;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SneakerType getSneaker() {
		return sneaker;
	}

	public void setSneaker(SneakerType sneaker) {
		this.sneaker = sneaker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public SneakerSell(Long id, String customerName, String customerLastName, String phone, String email,
			SneakerType sneaker, int price) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.customerLastName = customerLastName;
		this.phone = phone;
		this.email = email;
		this.sneaker = sneaker;
		this.price = price;
	}

	public SneakerSell() {
	}
	
	
	
	

}

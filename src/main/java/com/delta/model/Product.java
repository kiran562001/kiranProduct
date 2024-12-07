package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import aj.org.objectweb.asm.Type;
import lombok.Data;

@Entity

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private int productID;
	@NotNull
	private String name;
	@NotNull
	private double price;
	private String category;
	public int getProductID() {
		return productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
	

}

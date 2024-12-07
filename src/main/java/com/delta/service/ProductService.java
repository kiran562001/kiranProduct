package com.delta.service;

import java.util.List;

import com.delta.model.Product;

public interface ProductService {

	Product regProduct(Product pro);

	List<Product> getAllProduct();

	Product updateProduct(Product pro);

	Product deleteProduct(int id);

	List<Product> getPriceLow();

	List<Product> getPriceHigh();

	

}

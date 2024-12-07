package com.delta.serviceImpl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.comparator.Comparators;

import com.delta.dao.ProductRepository;
import com.delta.model.Product;
import com.delta.service.ProductService;
@Service
public class ProductServiceIML implements ProductService {
	@Autowired
	private ProductRepository repo;

	@Override
	public Product regProduct(Product pro) {
		
		return repo.save(pro);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return repo.findAll();
	}

	@Override
	public Product updateProduct(Product pro) {
		if(repo.existsById(pro.getProductID())) {
			return repo.save(pro);
		}
		return null;
	}

	@Override
	public Product deleteProduct(int id) {
		if(repo.existsById(id)) {
		Product product = repo.findById(id).get();
		repo.deleteById(id);
		return product ;
		}
		return null;
		
	}

	@Override
	public List<Product> getPriceLow() {
		List<Product> findAll = repo.findAll();
		List<Product> collect = findAll.stream()
				.sorted(Comparator.comparingDouble(Product::getPrice))
				.collect(Collectors.toList());
		return collect;
	}

	@Override
	public List<Product> getPriceHigh() {
		List<Product> findAll = repo.findAll();
		List<Product> collect = findAll.stream()
				.sorted(Comparator.comparingDouble(Product::getPrice).reversed())
				.collect(Collectors.toList());
		return collect;
	}
	
	

}

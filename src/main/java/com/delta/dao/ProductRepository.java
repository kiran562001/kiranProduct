package com.delta.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delta.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}

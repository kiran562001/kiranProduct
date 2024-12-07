package com.delta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delta.model.Product;
import com.delta.service.ProductService;

@RestController()
@RequestMapping("/controller")
public class ProductController {
	@Autowired
	private ProductService pServ;
	
	@PostMapping("/product")
	public ResponseEntity<Product> regProduct(@RequestBody Product pro){
		return ResponseEntity.status(HttpStatus.CREATED).body(pServ.regProduct(pro));
	}
	
   @GetMapping("/product")
   public ResponseEntity<List<Product>> getAllProduct(){
	   return ResponseEntity.status(HttpStatus.OK).body(pServ.getAllProduct());
   }
   @PutMapping("/product")
   public ResponseEntity<Product> updateProduct(@RequestBody Product pro){
	   return ResponseEntity.status(HttpStatus.OK).body(pServ.updateProduct(pro));
	   
   }
   @DeleteMapping("/product/{id}")
   public ResponseEntity<Product> deleteProduct(@PathVariable int id){
	   return ResponseEntity.status(HttpStatus.OK).body(pServ.deleteProduct(id));
   }
   
   @GetMapping("/product/price/low")
   public ResponseEntity<List<Product>> getPriceLow(){
	   
	   return ResponseEntity.status(HttpStatus.OK).body(pServ.getPriceLow());
			   
   }
   
   @GetMapping("/product/pricceHigh")
   public ResponseEntity<List<Product>> getPriceHigh(){
	   return ResponseEntity.status(HttpStatus.OK).body(pServ.getPriceHigh());
   }
   
   
	
}

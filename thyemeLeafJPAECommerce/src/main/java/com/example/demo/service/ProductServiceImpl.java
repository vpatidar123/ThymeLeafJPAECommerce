package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		
		return repository.findAll();
	}

	
	public Product findById(Integer id) {
	    Optional<Product> p = repository.findById(id);
	    Product product = null;
	    
	    if(p.isPresent())
	    	product = p.get();
	    return product;
	}
	
	public void save(Product product) {
		repository.save(product);
	}



	public void deleteById(int productId) {
		repository.deleteById(productId);
		
	}

}


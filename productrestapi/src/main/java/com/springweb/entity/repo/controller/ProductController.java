package com.springweb.entity.repo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springweb.entity.Product;
import com.springweb.entity.repo.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	ProductRepository prepo;

	@RequestMapping(value = "/products/", method = RequestMethod.GET)
	public List<Product> getProducts() {
		return prepo.findAll();

	}

	@RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
	public Product getProduct(@PathVariable("id")int id) {
		return prepo.findById(id).get();
	}
	
	@RequestMapping(value = "/products/", method = RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return prepo.save(product);
	}
	
	@RequestMapping(value = "/products/", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return prepo.save(product);
	}
	
	@RequestMapping(value = "/products/{id}", method = RequestMethod.POST)
	public void deleteProduct(@PathVariable("id") int id) {
		prepo.deleteById(id);
		
	}

}

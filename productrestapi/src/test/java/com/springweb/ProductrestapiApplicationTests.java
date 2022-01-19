package com.springweb;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.springweb.entity.Product;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductrestapiApplicationTests {

	@Autowired
	RestTemplate restT;

	@Test
	void getProduct() {
		Product product = restT.getForObject("http://localhost:8080/rohanapp/products/11", Product.class);

		assertNotNull(product);
		assertEquals(product.getName(), "nestle");
	}
	
//	@Test
	void createProduct() {
		
		Product product = new Product();
		product.setName("nestle");
		product.setDescription("mil product");
		product.setPrice(90);
		Product newProduct = restT.postForObject("http://localhost:8080/rohanapp/products/", product, Product.class);
		
		

		assertNotNull(newProduct);
		assertEquals(product.getName(), "nestle");
	}
	
	@Test
	void updateProduct() {
		Product product = restT.getForObject("http://localhost:8080/rohanapp/products/11", Product.class);
		
		product.setPrice(10000000);
//		String pr = "http://localhost:8080/rohanapp/products/"+product.getId();
		restT.put("http://localhost:8080/rohanapp/products/",product);
		
	
	}

}

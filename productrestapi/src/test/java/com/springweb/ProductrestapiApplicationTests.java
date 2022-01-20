package com.springweb;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.springweb.entity.Product;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductrestapiApplicationTests {

	
	@Value("${productrestapi.services.url}")
	String baseUrl;
	
	
	@Autowired
	RestTemplate restT;

	@Test
	void getProduct() {
		
		System.out.println(baseUrl);
		Product product = restT.getForObject(baseUrl+"11", Product.class);

		assertNotNull(product);
		assertEquals(product.getName(), "nestle");
	}
	
//	@Test
	void createProduct() {
		
		Product product = new Product();
		product.setName("nestle");
		product.setDescription("mil product");
		product.setPrice(90);
		Product newProduct = restT.postForObject(baseUrl, product, Product.class);
		
		

		assertNotNull(newProduct);
		assertEquals(product.getName(), "nestle");
	}
	
	@Test
	void updateProduct() {
		Product product = restT.getForObject(baseUrl+"11", Product.class);
		
		System.out.println(baseUrl);
		
		product.setPrice(800000);
//		String pr = "http://localhost:8080/rohanapp/products/"+product.getId();
		restT.put(baseUrl,product);
		
	}
	
	

	
	

}

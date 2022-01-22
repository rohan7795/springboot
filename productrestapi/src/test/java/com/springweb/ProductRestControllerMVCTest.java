package com.springweb;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.springweb.entity.Product;
import com.springweb.entity.repo.ProductRepository;

@RunWith(SpringRunner.class)
@WebMvcTest
public class ProductRestControllerMVCTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ProductRepository repo;

	@Test
	public void findAll() throws Exception {
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("TV");
		product1.setDescription("nice");
		product1.setPrice(100000);

		List<Product> products = Arrays.asList(product1);

		when(repo.findAll()).thenReturn(products);

		mockMvc.perform(get("rohanapp/products/").contextPath("/rohanapp")).andExpect(status().isOk());
	}

}

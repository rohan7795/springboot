package com.springweb.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springweb.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}

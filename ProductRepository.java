package com.rashmi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rashmi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Product findById(long id);
}

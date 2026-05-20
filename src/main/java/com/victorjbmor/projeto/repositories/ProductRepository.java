package com.victorjbmor.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorjbmor.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}

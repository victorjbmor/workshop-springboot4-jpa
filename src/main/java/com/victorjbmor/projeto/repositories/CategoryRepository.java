package com.victorjbmor.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorjbmor.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}

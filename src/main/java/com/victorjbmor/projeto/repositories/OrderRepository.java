package com.victorjbmor.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorjbmor.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}

package com.victorjbmor.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorjbmor.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

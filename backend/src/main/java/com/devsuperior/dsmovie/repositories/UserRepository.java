package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	
	// Buscar pelo Email -> Padronização do Spring Data find by + Campo da Tabela User -> Ex: Email
	User findByEmail(String email);

}

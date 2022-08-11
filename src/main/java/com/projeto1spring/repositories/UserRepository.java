package com.projeto1spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto1spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

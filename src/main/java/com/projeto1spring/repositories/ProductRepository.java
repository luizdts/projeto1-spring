package com.projeto1spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto1spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

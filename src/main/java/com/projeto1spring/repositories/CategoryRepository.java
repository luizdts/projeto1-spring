package com.projeto1spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto1spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

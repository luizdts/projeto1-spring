package com.projeto1spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto1spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

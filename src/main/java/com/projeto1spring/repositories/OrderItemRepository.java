package com.projeto1spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto1spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

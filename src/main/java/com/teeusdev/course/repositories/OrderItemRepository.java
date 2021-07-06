package com.teeusdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teeusdev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

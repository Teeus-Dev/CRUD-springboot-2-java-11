package com.teeusdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teeusdev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

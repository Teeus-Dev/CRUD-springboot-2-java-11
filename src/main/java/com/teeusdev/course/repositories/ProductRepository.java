package com.teeusdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teeusdev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

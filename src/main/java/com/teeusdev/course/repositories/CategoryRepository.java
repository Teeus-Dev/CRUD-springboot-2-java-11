package com.teeusdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teeusdev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

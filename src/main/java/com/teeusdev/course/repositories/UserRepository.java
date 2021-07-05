package com.teeusdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teeusdev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

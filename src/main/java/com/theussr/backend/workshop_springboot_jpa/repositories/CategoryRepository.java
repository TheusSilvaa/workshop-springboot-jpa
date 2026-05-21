package com.theussr.backend.workshop_springboot_jpa.repositories;

import com.theussr.backend.workshop_springboot_jpa.entities.Category;
import com.theussr.backend.workshop_springboot_jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

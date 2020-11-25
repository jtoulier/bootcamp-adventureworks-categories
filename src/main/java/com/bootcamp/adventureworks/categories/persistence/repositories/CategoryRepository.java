package com.bootcamp.adventureworks.categories.persistence.repositories;

import com.bootcamp.adventureworks.categories.persistence.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

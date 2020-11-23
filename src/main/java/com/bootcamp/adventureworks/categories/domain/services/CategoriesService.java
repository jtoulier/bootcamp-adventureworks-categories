package com.bootcamp.adventureworks.categories.domain.services;

import com.bootcamp.adventureworks.categories.domain.dto.CategoryDto;

import java.util.List;

public interface CategoriesService {
    CategoryDto findById(Integer id);
    List<CategoryDto> findAll();
}

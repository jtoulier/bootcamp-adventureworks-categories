package com.bootcamp.adventureworks.categories.domain.services.impl;

import com.bootcamp.adventureworks.categories.domain.dto.CategoryDto;
import com.bootcamp.adventureworks.categories.domain.mappers.CategoriesMapper;
import com.bootcamp.adventureworks.categories.domain.services.CategoriesService;
import com.bootcamp.adventureworks.categories.persistence.entities.Category;
import com.bootcamp.adventureworks.categories.persistence.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoriesMapper categoriesMapper;

    @Override
    public CategoryDto findById(Integer id) {
        var category = this.categoryRepository.findById(id).get();
        return this.categoriesMapper.toCategoryDto(category);
    }

    @Override
    public List<CategoryDto> findAll() {
        var categories = this.categoryRepository.findAll();
        return this.categoriesMapper.toCategoriesDto(categories);
    }
}

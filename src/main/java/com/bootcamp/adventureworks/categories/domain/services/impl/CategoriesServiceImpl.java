package com.bootcamp.adventureworks.categories.domain.services.impl;

import com.bootcamp.adventureworks.categories.domain.dto.CategoryDto;
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

    @Override
    public CategoryDto findById(Integer id) {
        var category = this.categoryRepository.findById(id).get();

        var result = new CategoryDto();

        result.setId(category.getId());
        result.setName(category.getName());
        result.setParentId(category.getParentId());
        result.setRowguid(category.getRowguid());
        result.setModifiedDate(category.getModifiedDate());

        return result;
    }

    @Override
    public List<CategoryDto> findAll() {
        var categories = this.categoryRepository.findAll();

        List<CategoryDto> result = new ArrayList<>();

        for (Category category:categories) {
            var categoryDto = new CategoryDto();

            categoryDto.setId(category.getId());
            categoryDto.setName(category.getName());
            categoryDto.setParentId(category.getParentId());
            categoryDto.setRowguid(category.getRowguid());
            categoryDto.setModifiedDate(category.getModifiedDate());

            result.add(categoryDto);
        }

        return result;
    }
}

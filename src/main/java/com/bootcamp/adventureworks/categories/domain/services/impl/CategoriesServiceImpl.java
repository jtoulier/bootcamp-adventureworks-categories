package com.bootcamp.adventureworks.categories.domain.services.impl;

import com.bootcamp.adventureworks.categories.domain.dto.CategoryDto;
import com.bootcamp.adventureworks.categories.domain.services.CategoriesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {
    @Override
    public CategoryDto findById(Integer id) {
        return new CategoryDto(1, "Montañera");
    }

    @Override
    public List<CategoryDto> findAll() {
        List<CategoryDto> categories = new ArrayList<>();

        categories.add(new CategoryDto(1, "Montañera"));
        categories.add(new CategoryDto(2, "BMX"));

        return categories;
    }
}

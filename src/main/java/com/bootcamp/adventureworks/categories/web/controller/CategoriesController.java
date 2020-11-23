package com.bootcamp.adventureworks.categories.web.controller;

import com.bootcamp.adventureworks.categories.domain.dto.CategoryDto;
import com.bootcamp.adventureworks.categories.domain.services.CategoriesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoriesController {

    private CategoriesService categoriesService;

    private CategoriesController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @GetMapping("")
    List<CategoryDto> findAll() {
        return this.categoriesService.findAll();
    }

    @GetMapping("/{id}")
    CategoryDto findById(@PathVariable("id") Integer id) {
        return this.categoriesService.findById(id);
    }
}

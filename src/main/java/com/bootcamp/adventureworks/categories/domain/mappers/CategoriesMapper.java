package com.bootcamp.adventureworks.categories.domain.mappers;

import com.bootcamp.adventureworks.categories.domain.dto.CategoryDto;
import com.bootcamp.adventureworks.categories.persistence.entities.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriesMapper {
    CategoryDto toCategoryDto(Category entity);
    List<CategoryDto> toCategoriesDto(List<Category> entities);
}

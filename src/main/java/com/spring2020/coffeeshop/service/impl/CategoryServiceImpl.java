package com.spring2020.coffeeshop.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring2020.coffeeshop.domain.dto.CategoryDto;
import com.spring2020.coffeeshop.domain.entity.Category;
import com.spring2020.coffeeshop.exception.MissingInputException;
import com.spring2020.coffeeshop.repository.CategoryRepository;
import com.spring2020.coffeeshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ObjectMapper mapper;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        if (categoryDto == null) {
            throw new MissingInputException("missing input");
        }
        Category category = mapper.convertValue(categoryDto, Category.class);
        Category savedCategory = categoryRepository.save(category);
        return mapper.convertValue(savedCategory, CategoryDto.class);
    }
}

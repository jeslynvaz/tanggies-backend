package com.tanggiesbackend.serviceImpl;

import com.tanggiesbackend.dto.CreateCategoryRequest;
import com.tanggiesbackend.entities.Category;
import com.tanggiesbackend.repositories.CategoryRepository;
import com.tanggiesbackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;
    
    @Override
    public String create(CreateCategoryRequest request) {

        Category category = Category
                .builder()
                .isAlcohol(request.isAlcohol())
                .isBeverage(request.isBeverage())
                .name(request.getName())
                .build();

        categoryRepository.save(category);

        return "category created successfully";
    }

    @Override
    public String update(CreateCategoryRequest request) {

        Category category = categoryRepository.findById(request.getId());

        category.setAlcohol(request.isAlcohol());
        category.setBeverage(request.isBeverage());
        category.setName(request.getName());

        categoryRepository.save(category);

        return "Category updated successfully";
    }

    @Override
    public String delete(long id) {

        categoryRepository.deleteById(id);

        return "Category deleted successfully";
    }

    @Override
    public Category get(long id) {

        Category category = categoryRepository.findById(id);

        return category;
    }

    @Override
    public List<Category> getAll() {

        List<Category> categoryList = categoryRepository.findAll();

        return categoryList;
    }
}

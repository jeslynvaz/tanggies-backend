package com.tanggiesbackend.service;

import com.tanggiesbackend.dto.CreateCategoryRequest;
import com.tanggiesbackend.entities.Category;

import java.util.List;

public interface CategoryService {

    String create(CreateCategoryRequest request);

    String update(CreateCategoryRequest request);

    String delete(long id);

    Category get(long id);

    List<Category> getAll();
}

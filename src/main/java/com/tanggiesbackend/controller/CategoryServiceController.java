package com.tanggiesbackend.controller;

import com.tanggiesbackend.dto.CreateCategoryRequest;
import com.tanggiesbackend.entities.Category;
import com.tanggiesbackend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/category/")
public class CategoryServiceController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("create")
    public ResponseEntity<String> createCategory(@RequestBody CreateCategoryRequest request) {
        return ResponseEntity.ok(categoryService.create(request));
    }

    @PutMapping("update")
    public ResponseEntity<String> updateCategory(@RequestBody CreateCategoryRequest request) {
        return ResponseEntity.ok(categoryService.update(request));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
        return ResponseEntity.ok(categoryService.delete(id));
    }

    @GetMapping("get/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable long id) {
        return ResponseEntity.ok(categoryService.get(id));
    }

    @GetMapping("get-all")
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAll());
    }
}

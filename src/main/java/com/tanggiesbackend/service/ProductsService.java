package com.tanggiesbackend.service;

import com.tanggiesbackend.dto.CreateProductRequest;
import com.tanggiesbackend.entities.Products;

import java.util.List;

public interface ProductsService {

    String create(CreateProductRequest request);

    String update(CreateProductRequest request);

    String delete(long id);

    Products get(long id);

    List<Products> getAll();
}

package com.tanggiesbackend.serviceImpl;

import com.tanggiesbackend.dto.CreateProductRequest;
import com.tanggiesbackend.entities.Products;
import com.tanggiesbackend.repositories.ProductsRepository;
import com.tanggiesbackend.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  implements ProductsService {

    @Autowired
    ProductsRepository productsRepository;

    @Override
    public String create(CreateProductRequest request) {

        Products products =  Products
                .builder()
                .categoryId(request.getCategoryId())
                .name(request.getName())
                .price(request.getPrice())
                .description(request.getDescription())
                .ingredients(request.getIngredients())
                .build();

        productsRepository.save(products);

        return "Product created successfully";
    }

    @Override
    public String update(CreateProductRequest request) {

        Products existingProduct = productsRepository.findById(request.getId());

        Products updatedProduct =  Products
                .builder()
                .categoryId(request.getCategoryId())
                .name(request.getName())
                .price(request.getPrice())
                .description(request.getDescription())
                .ingredients(request.getIngredients())
                .build();

        productsRepository.save(updatedProduct);

        return "Product updated successfully";
    }

    @Override
    public String delete(long id) {

        productsRepository.deleteById(id);

        return "Product deleted successfully";
    }

    @Override
    public Products get(long id) {
        return productsRepository.findById(id);
    }

    @Override
    public List<Products> getAll() {
        return productsRepository.findAll();
    }
}

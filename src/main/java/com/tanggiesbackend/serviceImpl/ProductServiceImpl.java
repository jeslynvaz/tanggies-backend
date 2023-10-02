package com.tanggiesbackend.serviceimpl;

import com.tanggiesbackend.dto.CreateProductRequest;
import com.tanggiesbackend.entities.Category;
import com.tanggiesbackend.entities.Products;
import com.tanggiesbackend.repositories.ProdcutsRepository;
import com.tanggiesbackend.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  implements ProductsService {

    @Autowired
    ProdcutsRepository prodcutsRepository;

    @Override
    public String create(CreateProductRequest request) {
        Products products = Products
                .builder()
                .name(request.getName())
                .ingredients(request.getIngredients())
                .description(request.getDescription())
                .price(request.getPrice())
                .categoryId(request.getCategoryId())
                .build();

        prodcutsRepository.save(products);

        return null;
    }

    @Override
    public String update(CreateProductRequest request) {
        return null;
    }

    @Override
    public String delete(long id) {
        return null;
    }

    @Override
    public Products get(long id) {
        return null;
    }

    @Override
    public List<Products> getAll() {
        return null;
    }
}

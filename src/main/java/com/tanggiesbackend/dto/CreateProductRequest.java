package com.tanggiesbackend.dto;

import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class CreateProductRequest {

    @Nullable
    long id;

    String name;
    String ingredients;
    long price;
    String description;
}

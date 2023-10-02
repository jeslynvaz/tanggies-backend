package com.tanggiesbackend.dto;

import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class CreateCategoryRequest {

    @Nullable
    long id;

    String name;
    boolean isBeverage;
    boolean isAlcohol;
}

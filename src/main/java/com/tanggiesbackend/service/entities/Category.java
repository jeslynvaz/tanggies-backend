package com.tanggiesbackend.service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@Data
public class Category {

    @Id
    private long id;

    @Column(unique = true)
    private String name;

    private boolean isBeverage;
    private boolean isAlcohol;

    public Category() {

    }
}

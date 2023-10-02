package com.tanggiesbackend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Products {
    @Id
    private long id;

    private long categoryId;

    @Column(unique = true)
    private String name;
    private String ingredients;
    private long price;
    private String description;

    public Products() {

    }
}

package com.tanggiesbackend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
public class Products {
    @Id
    private long id;

    @Column(unique = true)
    private String name;
    private long categoryId;
    private String ingredients;
    private long price;
    private String description;

    public Products() {

    }
}

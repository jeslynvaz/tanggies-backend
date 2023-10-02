package com.tanggiesbackend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Products {
    @Id
    private long id;

    @Column(unique = true)
    private String name;
    private String ingredients;
    private long price;
    private String description;
}

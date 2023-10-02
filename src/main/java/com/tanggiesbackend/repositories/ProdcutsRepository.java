package com.tanggiesbackend.repositories;

import com.tanggiesbackend.service.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdcutsRepository extends JpaRepository<Products, Long> {

}

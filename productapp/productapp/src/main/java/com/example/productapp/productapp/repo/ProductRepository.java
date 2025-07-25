package com.example.productapp.productapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.productapp.productapp.model.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    
    public Product findByName(String name);
    
}

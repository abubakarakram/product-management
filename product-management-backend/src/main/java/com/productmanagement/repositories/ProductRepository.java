package com.productmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productmanagement.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

}

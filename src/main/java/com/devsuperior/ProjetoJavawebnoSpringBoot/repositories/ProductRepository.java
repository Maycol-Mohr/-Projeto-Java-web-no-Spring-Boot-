package com.devsuperior.ProjetoJavawebnoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.ProjetoJavawebnoSpringBoot.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
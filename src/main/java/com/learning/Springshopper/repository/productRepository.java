package com.learning.Springshopper.repository;

import com.learning.Springshopper.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<Product, Long> {
}

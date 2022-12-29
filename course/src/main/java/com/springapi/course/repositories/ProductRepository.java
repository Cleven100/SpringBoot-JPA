package com.springapi.course.repositories;

import com.springapi.course.entities.Category;
import com.springapi.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

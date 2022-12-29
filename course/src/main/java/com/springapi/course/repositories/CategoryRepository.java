package com.springapi.course.repositories;

import com.springapi.course.entities.Category;
import com.springapi.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

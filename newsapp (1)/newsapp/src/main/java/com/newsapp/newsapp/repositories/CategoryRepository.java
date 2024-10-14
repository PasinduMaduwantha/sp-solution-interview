package com.newsapp.newsapp.repositories;

import com.newsapp.newsapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}

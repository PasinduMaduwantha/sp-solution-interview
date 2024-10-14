package com.newsapp.newsapp.repositories;

import com.newsapp.newsapp.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findByCategories_Id(Long categoryId);
}

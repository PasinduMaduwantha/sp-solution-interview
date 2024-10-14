package com.newsapp.newsapp.services;

import com.newsapp.newsapp.model.News;
import com.newsapp.newsapp.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;

    public List<News> getNewsByCategory(Long categoryId) {
        return newsRepository.findByCategories_Id(categoryId);
    }

    public News getNewsById(Long id) {
        return newsRepository.findById(id).orElse(null);
    }
}

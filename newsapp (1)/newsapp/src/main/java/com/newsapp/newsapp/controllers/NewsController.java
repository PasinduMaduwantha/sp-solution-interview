package com.newsapp.newsapp.controllers;

import com.newsapp.newsapp.model.News;
import com.newsapp.newsapp.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping("/category/{id}")
    public List<News> getNewsByCategory(@PathVariable Long id) {
        return newsService.getNewsByCategory(id);
    }

    @GetMapping("/{id}")
    public News getNewsById(@PathVariable Long id) {
        return newsService.getNewsById(id);
    }
}

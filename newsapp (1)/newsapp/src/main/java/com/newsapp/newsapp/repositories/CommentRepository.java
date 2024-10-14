package com.newsapp.newsapp.repositories;

import com.newsapp.newsapp.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByNews_Id(Long newsId);
}

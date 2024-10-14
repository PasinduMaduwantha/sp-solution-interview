package com.newsapp.newsapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;
    private String commenterName;
    private Timestamp createdAt;

    @ManyToOne
    @JoinColumn(name = "news_id", nullable = false)
    private News news;
}

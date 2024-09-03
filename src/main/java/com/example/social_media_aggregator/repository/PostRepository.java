package com.example.social_media_aggregator.repository;

import com.example.social_media_aggregator.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

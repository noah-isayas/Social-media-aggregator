package com.example.social_media_aggregator.service;
import com.example.social_media_aggregator.model.Post;
import com.example.social_media_aggregator.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post createPost(String username, String content) {
        Post newPost = new Post(username, content, 0, LocalDateTime.now());
        return postRepository.save(newPost);
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }
}

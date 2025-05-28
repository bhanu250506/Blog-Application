package com.blog.BlogProject.config;

import com.blog.BlogProject.domain.entites.Post;
import com.blog.BlogProject.respositories.PostRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PostSecurityService {

    private final PostRepository postRepository;

    public PostSecurityService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public boolean hasAccessToPost(Authentication authentication, UUID postId) {
        // Retrieve the post by its ID
        Post post = postRepository.findById(postId).orElse(null);

        if (post == null) {
            return false; // Post not found
        }

        // Get the email of the authenticated user
        String authenticatedEmail = authentication.getName();

        // Check if the authenticated user is the author of the post
        return post.getAuthor().getEmail().equals(authenticatedEmail);
    }
}

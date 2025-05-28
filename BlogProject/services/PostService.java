package com.blog.BlogProject.services;

import com.blog.BlogProject.domain.CreatePostRequest;
import com.blog.BlogProject.domain.UpdatePostRequest;
import com.blog.BlogProject.domain.entites.Post;
import com.blog.BlogProject.domain.entites.User;

import java.util.List;
import java.util.UUID;
public interface PostService {
    Post getPost(UUID id);
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
    List<Post> getDraftPosts(User user);
    Post createPost(User user, CreatePostRequest createPostRequest);
    Post updatePost(UUID id, UpdatePostRequest updatePostRequest);
    void deletePost(UUID id);
}
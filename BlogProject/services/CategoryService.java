package com.blog.BlogProject.services;

import com.blog.BlogProject.domain.entites.Category;

import java.util.List;
import java.util.Locale;
import java.util.UUID;

public interface CategoryService {
    List<Category> listCategories();
    Category createCategory(Category category);
    void deleteCategory(UUID id);
    Category getCategoryById(UUID id);
}
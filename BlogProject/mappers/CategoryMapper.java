package com.blog.BlogProject.mappers;


import com.blog.BlogProject.domain.PostStatus;
import com.blog.BlogProject.domain.dtos.CategoryDto;
import com.blog.BlogProject.domain.dtos.CreateCategoryRequest;
import com.blog.BlogProject.domain.entites.Category;
import com.blog.BlogProject.domain.entites.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryMapper {

    @Mapping(target = "postCount", source = "posts", qualifiedByName = "calculatePostCount")
    CategoryDto toDto(Category category);

    Category toEntity(CreateCategoryRequest createCategoryRequest);


    @Named("calculatePostCount")
    default long calculatePostCount(List<Post> posts){
        if (null==posts){
            return 0;
        }
        return posts.stream()
                .filter(post -> PostStatus.PUBLISHED.equals(post.getStatus()))
                .count();
    }
}

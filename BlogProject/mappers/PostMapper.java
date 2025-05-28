package com.blog.BlogProject.mappers;

import com.blog.BlogProject.domain.CreatePostRequest;
import com.blog.BlogProject.domain.UpdatePostRequest;
import com.blog.BlogProject.domain.dtos.CreatePostRequestDto;
import com.blog.BlogProject.domain.dtos.PostDto;
import com.blog.BlogProject.domain.dtos.UpdatePostRequestDto;
import com.blog.BlogProject.domain.entites.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PostMapper {

    @Mapping(target = "author", source = "author")
    @Mapping(target = "category", source = "category")
    @Mapping(target = "tags", source = "tags")
    @Mapping(target = "status", source = "status")
    PostDto toDto(Post post);

    CreatePostRequest toCreatePostRequest(CreatePostRequestDto dto);

    UpdatePostRequest toUpdatePostRequest(UpdatePostRequestDto dto);

}


package com.vti.blogapp.Mapper;

import com.vti.blogapp.Dto.PostDto;
import com.vti.blogapp.Entity.Post;
import com.vti.blogapp.Form.PostCreateForm;

public class PostMapper
{
    public static Post map(PostCreateForm form)
    {
        var post = new Post();
        post.setTitle(form.getTitle());
        post.setDescription(form.getDescription());
        post.setContent(form.getContent());
        return post;
    }
    public static PostDto map(Post post)
    {
        var dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        dto.setCreateAt(post.getCreateAt());
        dto.setUpdatedAt(post.getUpdatedAt());
        return dto;
    }
}

package com.vti.blogapp.Mapper;

import com.vti.blogapp.Dto.CommentDto;
import com.vti.blogapp.Entity.Comment;
import com.vti.blogapp.Form.CommentCreateForm;

public class CommentMapper
{
    public static Comment map(CommentCreateForm form)
    {
        var comment = new Comment();
        comment.setName(form.getName());
        comment.setEmail(form.getEmail());
        comment.setBody(form.getBody());
        return comment;
    }
    public static CommentDto map(Comment comment)
    {
        var dto = new CommentDto();
        dto.setId(comment.getId());
        dto.setName(comment.getName());
        dto.setEmail(comment.getEmail());
        dto.setBody(comment.getBody());
        dto.setCreatedAt(comment.getCreatedAt());
        dto.setUpdatedAt(comment.getUpdatedAt());
        return dto;
    }
}

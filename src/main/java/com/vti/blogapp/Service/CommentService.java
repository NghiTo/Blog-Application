package com.vti.blogapp.Service;

import com.vti.blogapp.Dto.CommentDto;
import com.vti.blogapp.Form.CommentCreateForm;

public interface CommentService
{
    CommentDto create(CommentCreateForm form, Long postId);
}

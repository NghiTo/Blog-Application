package com.vti.blogapp.Service;

import com.vti.blogapp.Dto.CommentDto;
import com.vti.blogapp.Form.CommentCreateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CommentService
{
    Page<CommentDto> findAll(Pageable pageable);
    CommentDto create(CommentCreateForm form, Long postId);
}

package com.vti.blogapp.Service;

import com.vti.blogapp.Dto.CommentDto;
import com.vti.blogapp.Form.CommentCreateForm;
import com.vti.blogapp.Form.CommentFilterForm;
import com.vti.blogapp.Form.CommentUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CommentService
{
    Page<CommentDto> findAll(CommentFilterForm form, Pageable pageable);
    Page<CommentDto> findByPostId(Long postId, Pageable pageable);
    CommentDto create(CommentCreateForm form, Long postId);
    CommentDto update(CommentUpdateForm form, Long id);
    void deleteById(Long id);
    void deleteByEmail(String email);
}

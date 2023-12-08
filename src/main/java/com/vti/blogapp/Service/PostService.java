package com.vti.blogapp.Service;

import com.vti.blogapp.Dto.PostDto;
import com.vti.blogapp.Form.PostCreateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService
{
    Page<PostDto> findAll(Pageable pageable);
    PostDto create(PostCreateForm form);
}

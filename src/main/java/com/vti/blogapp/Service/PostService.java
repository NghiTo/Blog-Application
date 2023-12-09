package com.vti.blogapp.Service;

import com.vti.blogapp.Dto.PostDto;
import com.vti.blogapp.Form.PostCreateForm;
import com.vti.blogapp.Form.PostUpdateForm;
import jakarta.persistence.PostUpdate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService
{
    Page<PostDto> findAll(Pageable pageable);
    PostDto findById(Long id);
    PostDto create(PostCreateForm form);
    PostDto update(PostUpdateForm form, Long id);
    void deleteById(Long id);
}

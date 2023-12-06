package com.vti.blogapp.Service;

import com.vti.blogapp.Dto.PostDto;
import com.vti.blogapp.Form.PostCreateForm;

public interface PostService
{
    PostDto create(PostCreateForm form);
}

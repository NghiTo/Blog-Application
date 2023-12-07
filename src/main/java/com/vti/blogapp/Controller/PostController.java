package com.vti.blogapp.Controller;

import com.vti.blogapp.Dto.PostDto;
import com.vti.blogapp.Form.PostCreateForm;
import com.vti.blogapp.Service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PostController
{
    private final PostService postService;
    @PostMapping("/api/v1/posts")
    public PostDto create(@RequestBody PostCreateForm form)
    {
        return postService.create(form);
    }
}

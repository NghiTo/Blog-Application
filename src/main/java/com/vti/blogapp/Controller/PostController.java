package com.vti.blogapp.Controller;

import com.vti.blogapp.Dto.PostDto;
import com.vti.blogapp.Form.PostCreateForm;
import com.vti.blogapp.Form.PostUpdateForm;
import com.vti.blogapp.Service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class PostController
{
    private final PostService postService;
    @GetMapping("/api/v1/posts")
    public Page<PostDto> findAll(Pageable pageable)
    {
        return postService.findAll(pageable);
    }
    @GetMapping("/api/v1/posts/{id}")
    public PostDto findById(@PathVariable("id") Long id)
    {
        return postService.findById(id);
    }
    @PostMapping("/api/v1/posts")
    public PostDto create(@RequestBody PostCreateForm form)
    {
        return postService.create(form);
    }
    @PutMapping("/api/v1/posts/{id}")
    public PostDto update(@RequestBody PostUpdateForm form, @PathVariable("id") Long id)
    {
        return postService.update(form, id);
    }
    @DeleteMapping("/api/v1/posts/{id}")
    public void deleteById(@PathVariable("id") Long id)
    {
        postService.deleteById(id);
    }
}

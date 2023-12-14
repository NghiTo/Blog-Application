package com.vti.blogapp.Controller;

import com.vti.blogapp.Dto.PostDto;
import com.vti.blogapp.Form.PostCreateForm;
import com.vti.blogapp.Form.PostFilterForm;
import com.vti.blogapp.Form.PostUpdateForm;
import com.vti.blogapp.Service.PostService;
import com.vti.blogapp.Validation.PostIdExist;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@AllArgsConstructor
public class PostController
{
    private final PostService postService;
    @GetMapping("/api/v1/posts")
    public Page<PostDto> findAll(PostFilterForm form, Pageable pageable)
    {
        return postService.findAll(form, pageable);
    }
    @GetMapping("/api/v1/posts/{id}")
    public PostDto findById(@PathVariable("id") @PostIdExist Long id)
    {
        return postService.findById(id);
    }
    @PostMapping("/api/v1/posts")
    public PostDto create(@RequestBody @Valid PostCreateForm form)
    {
        return postService.create(form);
    }
    @PutMapping("/api/v1/posts/{id}")
    public PostDto update(@RequestBody @Valid PostUpdateForm form, @PathVariable("id") @PostIdExist Long id)
    {
        return postService.update(form, id);
    }
    @DeleteMapping("/api/v1/posts/{id}")
    public void deleteById(@PathVariable("id") @PostIdExist Long id)
    {
        postService.deleteById(id);
    }

}

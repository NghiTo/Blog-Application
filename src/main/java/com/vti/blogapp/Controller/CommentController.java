package com.vti.blogapp.Controller;

import com.vti.blogapp.Dto.CommentDto;
import com.vti.blogapp.Form.CommentCreateForm;
import com.vti.blogapp.Form.CommentFilterForm;
import com.vti.blogapp.Form.CommentUpdateForm;
import com.vti.blogapp.Service.CommentService;
import com.vti.blogapp.Validation.CommentIdExist;
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
public class CommentController
{
    private final CommentService commentService;
    @GetMapping("/api/v1/comments")
    public Page<CommentDto> findAll(CommentFilterForm form, Pageable pageable)
    {
        return commentService.findAll(form, pageable);
    }
    @GetMapping("/api/v1/posts/{postId}/comments")
    public Page<CommentDto> findByPostId(@PathVariable("postId") @PostIdExist Long postId, Pageable pageable)
    {
        return commentService.findByPostId(postId, pageable);
    }
    @PostMapping("/api/v1/posts/{postId}/comments")
    public CommentDto create(@RequestBody @Valid CommentCreateForm form, @PathVariable("postId") Long postId)
    {
        return commentService.create(form, postId);
    }
    @PutMapping("/api/v1/comments/{id}")
    public CommentDto update(@RequestBody @Valid CommentUpdateForm form, @PathVariable("id") @CommentIdExist Long id)
    {
        return commentService.update(form, id);
    }
    @DeleteMapping("/api/v1/comments/{id}")
    public void deleteById(@PathVariable("id") @CommentIdExist Long id)
    {
        commentService.deleteById(id);
    }
    @DeleteMapping("/api/v1/comments/email/{email}")
    public void deleteByEmail(@PathVariable("email") String email)
    {
        commentService.deleteByEmail(email);
    }
}

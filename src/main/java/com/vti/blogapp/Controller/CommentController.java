package com.vti.blogapp.Controller;

import com.vti.blogapp.Dto.CommentDto;
import com.vti.blogapp.Form.CommentCreateForm;
import com.vti.blogapp.Service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CommentController
{
    private final CommentService commentService;
    @PostMapping("/api/v1/posts/{postId}/comments")
    public CommentDto create(@RequestBody CommentCreateForm form, @PathVariable("postId") Long postId)
    {
        return commentService.create(form, postId);
    }
}
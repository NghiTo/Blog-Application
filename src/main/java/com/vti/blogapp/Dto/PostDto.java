package com.vti.blogapp.Dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostDto
{
    private Long id;
    private String title;
    private String description;
    private String content;
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;
}
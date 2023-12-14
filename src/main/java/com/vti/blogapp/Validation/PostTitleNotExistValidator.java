package com.vti.blogapp.Validation;

import com.vti.blogapp.Repository.PostRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PostTitleNotExistValidator implements ConstraintValidator<PostIdExist, String>
{
    private final PostRepository postRepository;
    @Override
    public boolean isValid(String title, ConstraintValidatorContext context)
    {
        return postRepository.existsByTitle(title);
    }
}

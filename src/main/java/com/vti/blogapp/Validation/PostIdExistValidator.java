package com.vti.blogapp.Validation;

import com.vti.blogapp.Repository.PostRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PostIdExistValidator implements ConstraintValidator<PostIdExist, Long>
{
    private final PostRepository postRepository;
    @Override
    public boolean isValid(Long id, ConstraintValidatorContext context)
    {
        return postRepository.existsById(id);
    }
}

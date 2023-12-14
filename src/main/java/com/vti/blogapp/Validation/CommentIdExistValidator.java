package com.vti.blogapp.Validation;

import com.vti.blogapp.Repository.CommentRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CommentIdExistValidator implements ConstraintValidator<CommentIdExist, Long>
{
    private final CommentRepository commentRepository;
    @Override
    public boolean isValid(Long id, ConstraintValidatorContext context)
    {
        return commentRepository.existsById(id);
    }
}

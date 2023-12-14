package com.vti.blogapp.Validation;

import com.vti.blogapp.Form.PostCreateForm;
import com.vti.blogapp.Repository.PostRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PostTitleNotExistValidator implements ConstraintValidator<PostTitleNotExist, PostCreateForm>
{
    private final PostRepository postRepository;
//    @Override
//    public boolean isValid(String title, ConstraintValidatorContext context)
//    {
//        return !postRepository.existsByTitle(title);
//    }

    @Override
    public boolean isValid(PostCreateForm postCreateForm, ConstraintValidatorContext constraintValidatorContext) {
        return !postRepository.existsByTitle(postCreateForm.getTitle());
    }
}

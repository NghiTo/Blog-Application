package com.vti.blogapp.Validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = PostIdExistValidator.class)
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface PostIdExist
{
    String message() default "{post.id.Exists.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

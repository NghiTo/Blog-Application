package com.vti.blogapp.Mapper;

import com.vti.blogapp.Dto.UserDto;
import com.vti.blogapp.Entity.User;
import com.vti.blogapp.Form.UserCreateForm;

public class UserMapper
{
    public static User map(UserCreateForm form)
    {
        var user = new User();
        user.setName(form.getName());
        user.setUsername(form.getUsername());
        user.setEmail(form.getEmail());
        user.setPassword(form.getPassword());
        return user;
    }

    public static UserDto map(User user)
    {
        var dto = new UserDto();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
        dto.setCreatedAt(user.getCreatedAt());
        dto.setUpdatedAt(user.getUpdatedAt());
        return dto;
    }
}

package com.vti.blogapp.Service;

import com.vti.blogapp.Dto.UserDto;
import com.vti.blogapp.Form.UserCreateForm;

public interface UserService
{
    UserDto create(UserCreateForm form);
}

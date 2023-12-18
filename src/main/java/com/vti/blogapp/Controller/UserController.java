package com.vti.blogapp.Controller;

import com.vti.blogapp.Dto.UserDto;
import com.vti.blogapp.Form.UserCreateForm;
import com.vti.blogapp.Service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Validated
@RestController
@AllArgsConstructor
public class UserController
{
    private final UserService userService;
    @PostMapping("/api/v1/users")
    public UserDto create(@RequestBody @Valid UserCreateForm form)
    {
        return userService.create(form);
    }
}

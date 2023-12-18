package com.vti.blogapp.Service;

import com.vti.blogapp.Dto.UserDto;
import com.vti.blogapp.Form.UserCreateForm;
import com.vti.blogapp.Mapper.UserMapper;
import com.vti.blogapp.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService
{
    private final UserRepository userRepository;
    @Override
    public UserDto create(UserCreateForm form)
    {
        var user = UserMapper.map(form);
        var savedUser = userRepository.save(user);
        return UserMapper.map(savedUser);
    }
}

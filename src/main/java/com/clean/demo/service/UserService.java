package com.clean.demo.service;

import com.clean.demo.domain.UserApp;
import com.clean.demo.dto.UserDto;

import java.util.List;

public interface UserService {
    UserApp addUser(UserDto userDto);
    List<UserDto> getUsers();
}

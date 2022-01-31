package com.clean.demo.user.service_impl;

import com.clean.demo.domain.UserApp;
import com.clean.demo.dto.UserDto;
import com.clean.demo.mapper.UserMapper;
import com.clean.demo.repository.UserRepository;
import com.clean.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserApp addUser(UserDto userDto) {
        UserApp userToSave = UserMapper.toUser(userDto);
        return userRepository.save(userToSave);
    }

    @Override
    public List<UserApp> getUsers() {
        return userRepository.findAll();
    }


}

package com.clean.demo.mapper;

import com.clean.demo.domain.UserApp;
import com.clean.demo.dto.UserDto;

public final class UserMapper {

    UserMapper() {}

    public static UserApp toUser(UserDto userDto) {
        return UserApp.builder()
                .name(userDto.getName())
                .build();
    }
}

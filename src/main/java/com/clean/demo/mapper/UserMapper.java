package com.clean.demo.mapper;

import com.clean.demo.domain.UserApp;
import com.clean.demo.dto.UserDto;

import java.util.List;
import java.util.stream.Collectors;

public final class UserMapper {

    UserMapper() {}

    public static UserApp toUser(UserDto userDto) {
        return UserApp.builder()
                .name(userDto.getName())
                .build();
    }

    public static List<UserDto> toUserDtos(List<UserApp> users) {
        return users.stream()
                .map(UserMapper::toUserDto)
                .collect(Collectors.toList());
    }

    private static UserDto toUserDto(UserApp userApp) {
        return UserDto.builder()
                .name(userApp.getName())
                .build();
    }
}

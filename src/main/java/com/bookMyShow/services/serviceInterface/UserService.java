package com.bookMyShow.services.serviceInterface;

import com.bookMyShow.dtos.UserDto;

import java.util.List;

public interface UserService {
    UserDto registerNewUser(UserDto userDto);
    UserDto createUser(UserDto user);
}

package com.bookMyShow.controller;


import com.bookMyShow.dtos.UserDto;
import com.bookMyShow.payoads.ApiResponse;
import com.bookMyShow.services.serviceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto){

        UserDto createUserDto = this.userService.registerNewUser(userDto);
        return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
    }

}

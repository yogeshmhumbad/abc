package com.bookMyShow.services;

import com.bookMyShow.dtos.UserDto;
import com.bookMyShow.entites.User;
import com.bookMyShow.repositores.UserRepository;
import com.bookMyShow.services.serviceInterface.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    //@Autowired
    //private PasswordEncoder passwordEncoder;

    @Override
    public UserDto registerNewUser(UserDto userDto) {
        User user = this.modelMapper.map(userDto,User.class);
        //encoding password
        user.setPassword(user.getPassword());
        //user.setPassword(this.passwordEncoder.encode(user.getPassword()));
        //getting roles
        //Role role = this.roleRepository.findById(AppConstants.NORMAL_USER).get();

       // user.getRoles().add(role);

        return this.modelMapper.map(this.userRepository.save(user),UserDto.class);
    }

    @Override
    public UserDto createUser(UserDto user) {
        return null;
    }
}

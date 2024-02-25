package com.bookMyShow.services;

import com.bookMyShow.services.serviceInterface.TheaterService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class TheaterServiceImpl implements TheaterService {
    @Autowired
    private ModelMapper modelMapper;


}

package com.bookMyShow.dtos;

import lombok.Data;

@Data
public class TheaterDto {
    private int id;
    private String theaterName;
    private String location;
    //private int screenNo;
    private double price;

}

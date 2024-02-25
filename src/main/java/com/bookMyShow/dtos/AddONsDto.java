package com.bookMyShow.dtos;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class AddONsDto {

    private int id;
    private String food;
    private float foodPrice;

}

package com.bookMyShow.dtos;

import com.bookMyShow.entites.Booking;
import com.bookMyShow.entites.entityInteface.PaymentMode;
import com.fasterxml.jackson.annotation.JsonFormat;
import  lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    private int id;

    @NotEmpty
    private String moviePoster;

    @NotEmpty
    private String movieName;

    @NotNull
    private LocalDate releaseDate;

    private String category;

    @NotEmpty
    private String genre;

    @NotEmpty
    private float rating;

    @NotEmpty
    private String country;

    private Booking booking;


}

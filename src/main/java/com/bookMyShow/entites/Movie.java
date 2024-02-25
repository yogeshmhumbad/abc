package com.bookMyShow.entites;

import com.bookMyShow.entites.entityInteface.PaymentMode;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String moviePoster;

    private String movieName;

    private LocalDate releaseDate;

    private String category;

    private String genre;

    private float rating;

    private String country;

    //@ManyToOne
   // private Booking booking;


}

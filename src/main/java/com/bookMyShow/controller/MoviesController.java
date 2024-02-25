package com.bookMyShow.controller;

import com.bookMyShow.dtos.MovieDto;
import com.bookMyShow.services.serviceInterface.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MoviesController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public ResponseEntity<List<MovieDto>> getMovies(){

        return new ResponseEntity<List<MovieDto>>(this.movieService.getMovies(), HttpStatus.OK);
    }
//    @GetMapping("/movies/{movieName}")
//    public ResponseEntity<Optional> getMovieByName(@PathVariable String movieName){
//
//        return new ResponseEntity<>(this.movieService.getMovieByMovieName(movieName), HttpStatus.OK);
//    }
    @GetMapping("/movies/{id}")
    public ResponseEntity<Optional> getMovieById(@PathVariable int id){

        return new ResponseEntity<>(this.movieService.getMovieById(id), HttpStatus.OK);
    }
    @GetMapping("/movies/{movieName}")
    public ResponseEntity<List<MovieDto>> getMovieByAlphabet(@PathVariable String movieName){

        return new ResponseEntity<>(this.movieService.getMovieByAlphabet(movieName), HttpStatus.OK);
    }

    @PostMapping("/newMovie")
    public ResponseEntity<MovieDto> registerMovie(@RequestBody MovieDto movieDto){

        return new ResponseEntity<>(movieService.registerNewMovie(movieDto),HttpStatus.CREATED);
    }

}

package com.bookMyShow.services.serviceInterface;

import com.bookMyShow.dtos.MovieDto;
import com.bookMyShow.entites.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    MovieDto registerNewMovie(MovieDto movieDto);
    List<MovieDto> getMovies();
    Optional<MovieDto> getMovieById(int id);
    Optional<MovieDto> getMovieByMovieName(String movieName);
    List<MovieDto> getMovieByAlphabet(String alphabet);
}

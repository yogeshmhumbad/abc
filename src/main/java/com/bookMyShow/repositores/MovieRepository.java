package com.bookMyShow.repositores;

import com.bookMyShow.dtos.MovieDto;
import com.bookMyShow.entites.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
    Optional<Movie> findByMovieName(String movieName);
    List<Movie> findByMovieNameContainsAllIgnoreCase(String alphabet);
}

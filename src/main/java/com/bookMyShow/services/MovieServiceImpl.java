package com.bookMyShow.services;

import com.bookMyShow.dtos.MovieDto;
import com.bookMyShow.entites.Movie;
import com.bookMyShow.repositores.MovieRepository;
import com.bookMyShow.services.serviceInterface.MovieService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public MovieDto registerNewMovie(MovieDto movieDto) {
        Movie movie = this.modelMapper.map(movieDto,Movie.class);
        return this.modelMapper.map(this.movieRepository.save(movie),MovieDto.class);
        //Movie movie = new Movie();
        //BeanUtils.copyProperties(movieDto,movie);
        //this.movieRepository.save(movie);
        //BeanUtils.copyProperties(movie,movieDto);
        //return movieDto;
    }
    @Override
    public List<MovieDto> getMovies() {
        List<Movie> movies = movieRepository.findAll();
        List<MovieDto> movieDtos = movies.stream().
                                        map(movie -> this.modelMapper
                                                        .map(movie,MovieDto.class))
                                                        .collect(Collectors.toList());
        return movieDtos;
    }
    @Override
    public Optional<MovieDto> getMovieById(int id) {

        return Optional.ofNullable(this.modelMapper.map(this.movieRepository.findById(id), MovieDto.class));
    }

    @Override
    public Optional<MovieDto> getMovieByMovieName(String movieName) {
        return Optional.ofNullable(this.modelMapper.map(movieRepository.findByMovieName(movieName), MovieDto.class));
    }

    @Override
    public List<MovieDto> getMovieByAlphabet(String alphabet) {
        List<Movie> movies = movieRepository.findByMovieNameContainsAllIgnoreCase(alphabet);
        List<MovieDto> movieDtos = movies.stream().
                                            map(movie -> this.modelMapper
                                                             .map(movie,MovieDto.class))
                                                             .collect(Collectors.toList());
        return movieDtos;
    }
}

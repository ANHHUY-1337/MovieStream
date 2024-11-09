package com.example.MovieWebsite.service;

import com.example.MovieWebsite.dto.MovieDTO;
import com.example.MovieWebsite.entity.Movie;
import com.example.MovieWebsite.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Movie createMovie(MovieDTO movie){

        Movie movie_m = new Movie();
        movie_m.builder()
            .description(movie.getDescription())
            .image(movie.getImage())
            .build();
        
        return movieRepository.save(movie_m);
    }

}

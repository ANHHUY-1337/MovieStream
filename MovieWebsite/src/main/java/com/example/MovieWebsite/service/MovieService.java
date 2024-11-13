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

    public MovieDTO createMovie(MovieDTO movie){

        return movieRepository.save(movie);
    }

}

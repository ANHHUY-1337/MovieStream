package com.example.MovieWeb.controller;

import com.cloudinary.api.ApiResponse;
import com.example.MovieWeb.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.MovieWeb.repository.MovieRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;
    @GetMapping("/movie")
    public list listAll(){
        List<Movie> ListMovies = movieRepository.findAll();
        return list;
    }
}

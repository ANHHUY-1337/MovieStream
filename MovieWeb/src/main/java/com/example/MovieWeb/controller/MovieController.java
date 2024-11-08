package com.example.MovieWeb.controller;

import com.example.MovieWeb.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.MovieWeb.repository.MovieRepository;

import java.util.List;

@Controller
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;
    @GetMapping("/movie")
    public String listAll(){
        List<Movie> ListMovies = movieRepository.findAll();
        return ListMovies.toString();
    }
}

package com.example.MovieWebsite.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieWebsite.dto.MovieDTO;
import com.example.MovieWebsite.service.MovieService;

@RestController
@RequestMapping("/api_movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    @DeleteMapping("/delete")
    public String create(@PathVariable Integer movie_id){
        return "";
    }
}

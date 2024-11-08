package com.example.MovieWebsite.repository;

import com.example.MovieWebsite.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findAll();
}

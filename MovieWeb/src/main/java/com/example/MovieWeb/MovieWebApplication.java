package com.example.MovieWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.MovieWeb.repository.MovieRepository;

@SpringBootApplication
public class MovieWebApplication {
 @Autowired
 private MovieRepository movieRepository;
	public static void main(String[] args) {
		SpringApplication.run(MovieWebApplication.class, args);
	}

}

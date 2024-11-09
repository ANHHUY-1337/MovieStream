package com.example.MovieWebsite.dto;

import lombok.Data;

import java.util.Date;
@Data
public class MovieDTO {
    private Integer view;

    private Integer movieDuration;

    private String image;

    private String name;

    private String description;

    private Date releaseDate;

    private Double price;

    private String trailer;
}

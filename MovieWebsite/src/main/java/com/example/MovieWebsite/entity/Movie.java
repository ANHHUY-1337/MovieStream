package com.example.MovieWebsite.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;


import java.util.Date;

@Entity
@Table(name="Movie")
@Data
@Builder
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Movie", nullable = false)
    private Integer idMovie;

    @Column(name = "_View", nullable = false)
    private Integer view;

    @Column(name = "Movie_Duration", nullable = false)
    private Integer movieDuration;

    @Column(name = "Image", nullable = false)
    private String image;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Description", nullable = false, length = 511)
    private String description;

    @Column(name = "Release_Date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @Column(name = "Price", nullable = false)
    private Double price;

    @Column(name = "Trailer", nullable = false)
    private String trailer;
    
    // day là code của anh nè
    // cái này nó sẽ được thông báo nhé
}


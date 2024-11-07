package com.example.MovieWeb.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Builder
@Table(name="Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int ID_Movie;
    private int _View;
    private int Movie_Duration;
    private String Image;
    private String Name;
    private String Description;
    private Date Release_DATE;
    private Double Price;
    private String Trailer;


}

package com.example.MovieWeb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@Table(name="Movie")
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

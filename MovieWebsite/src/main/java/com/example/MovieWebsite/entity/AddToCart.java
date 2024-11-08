package com.example.MovieWebsite.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="Add_to_")
@Data
@Builder
public class AddToCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Movie", nullable = false)
    private Integer idMovie;

    @ManyToOne
    @JoinColumn(name = "ID_Movie", nullable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "ID_Cart", nullable = false)
    private Cart cart;

    @Column(name = "Name", nullable = false)
    private String name;
}

package com.example.MovieWebsite.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
@Entity
@Table(name="Features")
@Data
@Builder
public class Features {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Movie", nullable = false)
    private Integer idMovie;

    @ManyToOne
    @JoinColumn(name = "ID_Movie", nullable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "ID_ActorOrDirector", nullable = false)
    private ActorAndDirector actorOrDirector;
}

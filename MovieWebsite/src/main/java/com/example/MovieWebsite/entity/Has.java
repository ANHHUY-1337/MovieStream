package com.example.MovieWebsite.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
@Entity
@Table(name="Has")
@Data
@Builder
public class Has {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Movie", nullable = false)
    private Integer idMovie;

    @ManyToOne
    @JoinColumn(name = "ID_Movie", nullable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "ID_Category", nullable = false)
    private Category category;
}

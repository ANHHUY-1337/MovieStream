package com.example.MovieWebsite.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="Update_M")
@Data
@Builder
public class UpdateMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DayTime", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dayTime;

    @ManyToOne
    @JoinColumn(name = "ID_Movie", nullable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "ID_Admin", nullable = false)
    private Admin admin;
}

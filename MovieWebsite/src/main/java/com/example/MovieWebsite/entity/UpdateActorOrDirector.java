package com.example.MovieWebsite.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="Update_AD")
@Data
@Builder
public class UpdateActorOrDirector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DayTime", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dayTime;

    @ManyToOne
    @JoinColumn(name = "ID_Admin", nullable = false)
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "ID_ActorOrDirector", nullable = false)
    private ActorAndDirector actorOrDirector;
}
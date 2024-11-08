package com.example.MovieWebsite.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;


import java.util.Date;

@Entity
@Table(name="Actor_And_Director")
@Data
@Builder
public class ActorAndDirector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ActorOrDirector", nullable = false)
    private Integer idActorOrDirector;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Description", nullable = false, length = 511)
    private String description;

    @Column(name = "Avatar", nullable = false)
    private String avatar;

    @Column(name = "DOB", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dob;
}

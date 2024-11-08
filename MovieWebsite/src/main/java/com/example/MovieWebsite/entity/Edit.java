package com.example.MovieWebsite.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="Edit")
@Data
@Builder
public class Edit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Day_Time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dayTime;

    @ManyToOne
    @JoinColumn(name = "ID_User", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "ID_Admin", nullable = false)
    private Admin admin;
}

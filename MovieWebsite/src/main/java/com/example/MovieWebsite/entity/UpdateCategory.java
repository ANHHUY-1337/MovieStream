package com.example.MovieWebsite.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="Update_C")
@Data
@Builder
public class UpdateCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DayTime", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dayTime;

    @ManyToOne
    @JoinColumn(name = "ID_Admin", nullable = false)
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "ID_Category", nullable = false)
    private Category category;
}
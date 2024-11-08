package com.example.MovieWebsite.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="Watch")
@Data
@Builder
public class Watch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Time_Viewed", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeViewed;

    @ManyToOne
    @JoinColumn(name = "ID_User", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "ID_Movie", nullable = false)
    private Movie movie;
}

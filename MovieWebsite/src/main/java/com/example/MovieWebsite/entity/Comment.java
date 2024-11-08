package com.example.MovieWebsite.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="Comment")
@Data
@Builder
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Comment_Time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date commentTime;

    @Column(name = "Content", nullable = false, length = 511)
    private String content;

    @ManyToOne
    @JoinColumn(name = "ID_User", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "ID_Movie", nullable = false)
    private Movie movie;
}

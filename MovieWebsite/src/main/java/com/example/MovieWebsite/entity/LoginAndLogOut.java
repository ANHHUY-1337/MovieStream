package com.example.MovieWebsite.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;


@Entity
@Table(name="LoginAndLogOut")
@Data
@Builder
public class LoginAndLogOut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LoginORout", nullable = false)
    private Integer idLoginOrOut;

    @Column(name = "Login_Time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginTime;

    @Column(name = "Logout_Time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date logoutTime;

    @ManyToOne
    @JoinColumn(name = "ID_Admin", nullable = false)
    private Admin admin;
}

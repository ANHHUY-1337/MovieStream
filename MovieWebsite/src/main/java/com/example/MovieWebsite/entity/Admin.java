package com.example.MovieWebsite.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
@Entity
@Table(name="Admin")
@Data
@Builder
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Admin", nullable = false)
    private Integer idAdmin;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "Level", nullable = false)
    private Integer level;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Avatar", nullable = false)
    private String avatar;

    @Column(name = "Phone", nullable = false)
    private String phone;

    @Column(name = "Email", nullable = false)
    private String email;
}


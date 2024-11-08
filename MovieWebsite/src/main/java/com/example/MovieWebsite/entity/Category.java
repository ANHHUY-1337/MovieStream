package com.example.MovieWebsite.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="Category")
@Data
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Category", nullable = false)
    private Integer idCategory;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Description", nullable = false, length = 511)
    private String description;
}

package com.example.MovieWebsite.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
@Entity
@Table(name="Confirm_By")
@Data
@Builder
public class ConfirmBy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Admin_Name", nullable = false)
    private String adminName;

    @ManyToOne
    @JoinColumn(name = "ID_Order", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "ID_Admin", nullable = false)
    private Admin admin;
}

package com.example.MovieWebsite.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
@Entity
@Table(name="Cart")
@Data
@Builder
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Cart", nullable = false)
    private Integer idCart;

    @Column(name = "Quantity", nullable = false)
    private Integer quantity;
}

package com.example.MovieWebsite.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="Payment")
@Data
@Builder
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Payment", nullable = false)
    private Integer idPayment;

    @Column(name = "Amount", nullable = false)
    private Double amount;

    @Column(name = "Payment_Type", nullable = false)
    private String paymentType;

    @ManyToOne
    @JoinColumn(name = "ID_User", nullable = false)
    private User user;
}

package com.example.MovieWebsite.entity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name="_Order")
@Data
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Order", nullable = false)
    private Integer idOrder;

    @Column(name = "Order_Time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderTime;

    @Column(name = "Detail", nullable = false, length = 511)
    private String detail;

    @ManyToOne
    @JoinColumn(name = "ID_Payment", nullable = false)
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "ID_Cart", nullable = false)
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "ID_User", nullable = false)
    private User user;
}


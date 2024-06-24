package com.example.agenceimo.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Property {
    @Id
    private String propertyId;

    private String address;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PropertyType type;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    private LocalDate saleDate;
    private BigDecimal salePrice;
}

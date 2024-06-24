package com.example.agenceimo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "Property")
public class Property {
    @Id
    @Column(name = "property_id")
    private Long propertyId;

    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PropertyType type;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "sale_date")
    private LocalDate saleDate;

    @Column(name = "sale_price")
    private BigDecimal salePrice;
}

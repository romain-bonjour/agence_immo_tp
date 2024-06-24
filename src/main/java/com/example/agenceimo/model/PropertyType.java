package com.example.agenceimo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "property_type")
public class PropertyType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}


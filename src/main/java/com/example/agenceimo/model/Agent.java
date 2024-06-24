package com.example.agenceimo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "agent")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;

    private String lastname;
}
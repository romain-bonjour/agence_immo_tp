package com.example.agenceimo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PropertyAgent {
        @Id
        @ManyToOne
        @JoinColumn(name = "agent_id")
        private Agent agent;

        @Id
        @ManyToOne
        @JoinColumn(name = "property_id")
        private Property property;
}

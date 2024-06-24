package com.example.agenceimo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "property_agent")
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

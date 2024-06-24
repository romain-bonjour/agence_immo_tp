package com.example.agenceimo.repository;

import com.example.agenceimo.model.Property;
import com.example.agenceimo.model.PropertyAgent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyAgentRepository extends JpaRepository<Property, Long> {
    
}

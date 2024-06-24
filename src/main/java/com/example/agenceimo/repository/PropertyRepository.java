package com.example.agenceimo.repository;

import com.example.agenceimo.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
    
}

package com.example.agenceimo.repository;

import com.example.agenceimo.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    
}

package com.example.agenceimo.repository;

import com.example.agenceimo.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Long> {
    
}

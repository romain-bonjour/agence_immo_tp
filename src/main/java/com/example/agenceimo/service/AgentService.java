package com.example.agenceimo.service;

import com.example.agenceimo.model.Agent;

import java.util.List;

public interface AgentService {
 public List<Agent> getAll();
 public void add(Agent agent);
 public void update(Agent agent);
 public void delete(Long id);
 public Agent findById(Long id);
}

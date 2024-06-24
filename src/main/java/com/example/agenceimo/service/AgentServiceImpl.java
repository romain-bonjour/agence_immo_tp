package com.example.agenceimo.service;

import com.example.agenceimo.model.Agent;
import com.example.agenceimo.repository.AgentRepository;
import com.example.agenceimo.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgentServiceImpl implements AgentService {

   @Autowired
   AgentRepository agentRepository;

    @Override
    public List<Agent> getAll() {
       return agentRepository.findAll();
   }

    @Override
    public void add(Agent agent) {
        agentRepository.save(agent);
    }

    @Override
    public void update(Agent agent) {
        if (findById(agent.getId()) != null) {
            agentRepository.save(agent);
        }
    }

    @Override
    public void delete(Long id) {
        agentRepository.deleteById(id);
    }

    @Override
    public Agent findById(Long id) {
        Optional<Agent> optionalAgent = agentRepository.findById(id);
        if (optionalAgent.isPresent()) {
            return optionalAgent.get();
        }
        return null;
    }
    
}

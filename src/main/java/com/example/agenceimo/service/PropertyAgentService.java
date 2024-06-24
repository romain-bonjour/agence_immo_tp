package com.example.agenceimo.service;

import com.example.agenceimo.model.PropertyAgent;

import java.util.List;

public interface PropertyAgentService {
 public List<PropertyAgent> getAll();
 public void add(PropertyAgent propertyAgent);
 public void update(PropertyAgent propertyAgent);
 public void delete(Long id);
 public PropertyAgent findById(Long id);
}

package com.example.agenceimo.service;

import com.example.agenceimo.model.Property;

import java.util.List;

public interface PropertyService {
 public List<Property> getAll();
 public void add(Property property);
 public void update(Property Property);
 public void delete(Long id);
 public Property findById(Long id);
}

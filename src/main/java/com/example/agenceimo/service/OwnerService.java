package com.example.agenceimo.service;

import com.example.agenceimo.model.Owner;

import java.util.List;

public interface OwnerService {
 public List<Owner> getAll();
 public void add(Owner owner);
 public void update(Owner owner);
 public void delete(Long id);
 public Owner findById(Long id);
}

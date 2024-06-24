package com.example.agenceimo.service;

import com.example.agenceimo.model.Owner;
import com.example.agenceimo.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerServiceImpl implements OwnerService {

   @Autowired
   OwnerRepository ownerRepository;

    @Override
    public List<Owner> getAll() {
       return ownerRepository.findAll();
   }

    @Override
    public void add(Owner owner) {
        ownerRepository.save(owner);
    }

    @Override
    public void update(Owner owner) {
        if (findById(owner.getId()) != null) {
            ownerRepository.save(owner);
        }
    }

    @Override
    public void delete(Long id) {
        ownerRepository.deleteById(id);
    }

    @Override
    public Owner findById(Long id) {
        Optional<Owner> optionalOwner = ownerRepository.findById(id);
        if (optionalOwner.isPresent()) {
            return optionalOwner.get();
        }
        return null;
    }
    
}

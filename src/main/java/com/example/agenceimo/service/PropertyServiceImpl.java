package com.example.agenceimo.service;

import com.example.agenceimo.model.Property;
import com.example.agenceimo.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService {

   @Autowired
   PropertyRepository propertyRepository;

    @Override
    public List<Property> getAll() {
       return propertyRepository.findAll();
   }

    @Override
    public void add(Property property) {
        propertyRepository.save(property);
    }

    @Override
    public void update(Property property) {
        if (findById(property.getPropertyId()) != null) {
            propertyRepository.save(property);
        }
    }

    @Override
    public void delete(Long id) {
        propertyRepository.deleteById(id);
    }

    @Override
    public Property findById(Long id) {
        Optional<Property> optionalProperty = propertyRepository.findById(id);
        if (optionalProperty.isPresent()) {
            return optionalProperty.get();
        }
        return null;
    }
    
}

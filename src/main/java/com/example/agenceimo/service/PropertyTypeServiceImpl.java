package com.example.agenceimo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.agenceimo.model.PropertyType;
import com.example.agenceimo.repository.PropertyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PropertyTypeServiceImpl implements PropertyTypeService {

   @Autowired
   PropertyTypeRepository propertyTypeRepository;

    @Override
    public List<PropertyType> getAll() {
       return propertyTypeRepository.findAll();
   }

    @Override
    public void add(PropertyType propertyType) {
        propertyTypeRepository.save(propertyType);
    }

    @Override
    public void update(PropertyType propertyType) {
        if (findById(propertyType.getId()) != null) {
            propertyTypeRepository.save(propertyType);
        }
    }

    @Override
    public void delete(Long id) {
        propertyTypeRepository.deleteById(id);
    }

    @Override
    public PropertyType findById(Long id) {
        Optional<PropertyType> optionalpropertyType = propertyTypeRepository.findById(id);
        if (optionalpropertyType.isPresent()) {
            return optionalpropertyType.get();
        }
        return null;
    }
    
}

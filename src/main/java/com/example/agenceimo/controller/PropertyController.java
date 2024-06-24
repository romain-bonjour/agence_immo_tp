package com.example.agenceimo.controller;


import com.example.agenceimo.model.Property;
import com.example.agenceimo.service.PropertyService;
import com.example.agenceimo.service.PropertyTypeService;
import com.example.agenceimo.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/property")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    @Autowired
    private PropertyTypeService propertyTypeService;

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("propertys", propertyService.getAll());
        return "property/list";
    }

    @GetMapping("/add")
    public String displayAddForm(Model model) {
        model.addAttribute("property", new Property());
        model.addAttribute("propertyTypes", propertyTypeService.getAll());
        model.addAttribute("owners", ownerService.getAll());
        return "property/add";
    }

    @PostMapping("/add")
    public String processAdd(Property property) {
        propertyService.add(property);
        return "redirect:/property/list";
    }

    @GetMapping("/update/{id}")
    public String displayUpdateForm(@PathVariable("id") Long id, Model model) {
        Property property = propertyService.findById(id);
        model.addAttribute("property", property);
        model.addAttribute("propertyTypes", propertyTypeService.getAll());
        model.addAttribute("owners", ownerService.getAll());
        return "property/update";
    }

    @PostMapping("/update")
    public String processUpdate(Property property) {
        propertyService.update(property);
        return "redirect:/property/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        propertyService.delete(id);
        return "redirect:/property/list";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/property/list";
    }
}

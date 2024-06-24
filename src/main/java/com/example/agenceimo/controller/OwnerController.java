package com.example.agenceimo.controller;


import com.example.agenceimo.model.Owner;
import com.example.agenceimo.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {
    @Autowired
    private OwnerService ownerService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("owners", ownerService.getAll());
        return "owner/list";
    }

    @GetMapping("/add")
    public String displayAddForm(Model model) {
        model.addAttribute("owner", new Owner());
        return "owner/add";
    }

    @PostMapping("/add")
    public String processAdd(Owner owner) {
        ownerService.add(owner);
        return "redirect:/owner/list";
    }

    @GetMapping("/update/{id}")
    public String displayUpdateForm(@PathVariable("id") Long id, Model model) {
        Owner owner = ownerService.findById(id);
        model.addAttribute("owner", owner);
        return "owner/update";
    }

    @PostMapping("/update")
    public String processUpdate(Owner owner) {
        ownerService.update(owner);
        return "redirect:/owner/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        ownerService.delete(id);
        return "redirect:/owner/list";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/owner/list";
    }
}

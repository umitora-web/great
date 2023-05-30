package com.example.Lamal.controller;

import com.example.Lamal.model.Cadet;
import com.example.Lamal.respository.CadetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Properties;

@Controller
public class CadetController {
    @Autowired
    private CadetRepository respository;
    @GetMapping("/")
    public String getAllCadet(Model model){
        List<Cadet> cadets = respository.findAll();
        model.addAttribute("cadets",cadets);
        return "index";
}
    @PostMapping(value = "/add")
    public String saveProduct(@ModelAttribute("cadet") Cadet cadet) {
        Properties repository;
        respository.save(cadet);
        return "redirect:/";
    }
}

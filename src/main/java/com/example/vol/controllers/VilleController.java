package com.example.vol.controllers;


import com.example.vol.repositories.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VilleController {

    @Autowired
    private VilleRepository villeRepository;



}

package com.example.vol.controllers;

import com.example.vol.repositories.AeroportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AeroportController {
    @Autowired
    private AeroportRepository aeroportRepository;



}

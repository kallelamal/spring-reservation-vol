package com.example.vol.controllers;


import com.example.vol.repositories.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VolController {

    @Autowired
    private VolRepository volRepository;


}

package com.example.vol.controllers;

import com.example.vol.repositories.PassagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassagerController {

    @Autowired
    private PassagerRepository passagerRepository;



}

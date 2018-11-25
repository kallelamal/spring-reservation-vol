package com.example.vol.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.vol.repositories.ClientRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;



}

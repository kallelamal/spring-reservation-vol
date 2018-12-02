package com.example.vol.controllers;
import com.example.vol.models.Client;
import com.example.vol.models.Vol;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.vol.repositories.ClientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/clts")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @RequestMapping(value="/create",method=RequestMethod.POST)
    public ResponseEntity<Client> addClient(@RequestBody Client c) {
        Client clt = clientRepository.save(c);
        if (clt == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(clt, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Client updateClient(@RequestBody Client c) {
        return clientRepository.saveAndFlush(c);
    }

}

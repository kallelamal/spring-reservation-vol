package com.example.vol.controllers;

import com.example.vol.models.Client;
import com.example.vol.models.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.vol.repositories.ClientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/clts")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Client> addClient(@RequestBody Client c) {
        Client clt = clientRepository.save(c);
        if (clt == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(clt, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Client updateClient(@RequestBody Client c) {
        return clientRepository.saveAndFlush(c);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<Client> signInClient(@RequestBody Client client) {
        Client result = clientRepository.findByLoginCltAndPasswordClt(client.getLoginClt(), client.getPasswordClt());
        if (result == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/listres/{id}", method = RequestMethod.GET)
    public List<Reservation> getListReservationsById(@PathVariable int id) {
      return clientRepository.findByIdClt(id).getReservations();
    }
}

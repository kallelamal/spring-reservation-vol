package com.example.vol.controllers;

import com.example.vol.models.Client;
import com.example.vol.models.Passager;
import com.example.vol.repositories.PassagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value="/pass")
public class PassagerController {

    @Autowired
    private PassagerRepository passagerRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Passager> getAllPassagers() {
        return passagerRepository.findAll();
    }

    @RequestMapping(value="/create",method=RequestMethod.POST)
    public ResponseEntity<Passager> addPassager(@RequestBody Passager p) {
        Passager pass = passagerRepository.save(p);
        if (pass == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(pass, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Passager updatePassager(@RequestBody Passager p) {
        return passagerRepository.saveAndFlush(p);
    }

}

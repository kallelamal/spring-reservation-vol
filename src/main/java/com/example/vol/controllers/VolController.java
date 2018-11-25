package com.example.vol.controllers;


import com.example.vol.models.Vol;
import com.example.vol.repositories.VolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
public class VolController {

    @Autowired
    private VolRepository volRepository;

    @RequestMapping(value="/addVol",method=RequestMethod.POST)
    public ResponseEntity<Vol> addVol(@RequestBody Vol v) {
        Vol vol = volRepository.save(v);
        if (vol == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(vol, HttpStatus.CREATED);
    }

    @RequestMapping(value="/getVolByDate{dateDep}",method=RequestMethod.GET)
    public List<Vol> getVolByDate(Date dateDep) {
        return volRepository.findVolByDate(dateDep);
    }
}

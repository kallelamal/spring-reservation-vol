package com.example.vol.controllers;

import com.example.vol.models.Reservation;
import com.example.vol.models.Vol;
import com.example.vol.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/res")
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @RequestMapping(value="/create",method=RequestMethod.POST)
    public ResponseEntity<Reservation> addReservation(@RequestBody Reservation r) {
        Reservation res = reservationRepository.save(r);
        if (res == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/listClient/{idClt}", method = RequestMethod.GET)
    public List<Reservation> getReservationsByClient(@PathVariable long idClt) {
        return reservationRepository.findAllByClient_IdClt(idClt);
    }

    @RequestMapping(value = "/listPassager/{idPas}", method = RequestMethod.GET)
    public List<Reservation> getReservationsByPassager(@PathVariable long idPas) {
        return reservationRepository.findAllByPassager_IdPas(idPas);
    }

}

package com.example.vol.repositories;

import com.example.vol.models.Client;
import javax.transaction.Transactional;

import com.example.vol.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Transactional()
public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findByLoginCltAndPasswordClt(String login_clt, String password_clt);

    Client findByIdClt(int id);
   /* @Query("select nbrePlaceRestant from Vol v WHERE v.numVol = :numVol")
    int nbrePlaceRes(@Param("numVol") int num_vol);}*/
}
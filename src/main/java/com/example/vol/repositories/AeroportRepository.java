package com.example.vol.repositories;

import com.example.vol.models.Aeroport;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;


@Transactional()
public interface AeroportRepository extends JpaRepository<Aeroport, Long> {



    }

package com.example.vol.repositories;

import com.example.vol.models.Passager;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional()
public interface PassagerRepository extends JpaRepository<Passager, Long> {
}

package com.example.vol.repositories;

import com.example.vol.models.Client;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional()
public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findByLoginCltAndPasswordClt(String login_clt, String password_clt);
}

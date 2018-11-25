package com.example.vol.repositories;

import com.example.vol.models.Client;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Transactional()
public interface ClientRepository extends JpaRepository<Client, Long> {

        @Query("select i from Client i where i.login like :login  and i.password like :password")
        public Client signinClient(@Param("login") String login, @Param("password") String password);

    }

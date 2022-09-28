package me.dio.sacola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.qos.logback.core.net.server.Client;

@Repository
public interface ClienteRepository extends JpaRepository<Client, Long>{
    
}

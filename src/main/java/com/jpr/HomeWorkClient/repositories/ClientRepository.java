package com.jpr.HomeWorkClient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpr.HomeWorkClient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}

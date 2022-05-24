package com.jpr.HomeWorkClient.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.jpr.HomeWorkClient.dto.ClientDTO;
import com.jpr.HomeWorkClient.entities.Client;
import com.jpr.HomeWorkClient.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest){
		Page<Client> list = repository.findAll(pageRequest);
		return list.map(cli -> new ClientDTO(cli));
	}
}

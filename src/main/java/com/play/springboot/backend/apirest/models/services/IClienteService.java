package com.play.springboot.backend.apirest.models.services;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.play.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {


	public List<Cliente> findAll();
	
	public Page<Cliente> findAllPage(Pageable pageable );

	public Cliente findById(long id);

	public Cliente save(Cliente cliente);

	public void delete(long id);

}

package com.play.springboot.backend.apirest.models.services;

import java.util.List;

import com.play.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();

	public Cliente findById(long id);

	public Cliente save(Cliente cliente);

	public void delete(long id);

}

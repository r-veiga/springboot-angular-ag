package org.curso.aguzman.springangular.apirest.models.service;

import java.util.List;

import org.curso.aguzman.springangular.apirest.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();
	public void save(Cliente cliente);
	public Cliente findById(Long id);
	public void delete(Cliente cliente);
	public void delete(Long id);
}

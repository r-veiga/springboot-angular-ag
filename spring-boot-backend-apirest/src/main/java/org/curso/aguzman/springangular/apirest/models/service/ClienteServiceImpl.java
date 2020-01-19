package org.curso.aguzman.springangular.apirest.models.service;

import java.util.List;
import java.util.Optional;

import org.curso.aguzman.springangular.apirest.models.dao.IClienteDao;
import org.curso.aguzman.springangular.apirest.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id) {
		Cliente cliente = clienteDao.findById(id).orElse(null);
		return cliente;
	}

	@Override
	@Transactional
	public void delete(Cliente cliente) {
		clienteDao.delete(cliente);
	}

	@Override
	public void delete(Long id) {
		Cliente cliente = findById(id);
		delete(cliente);
	}

}
